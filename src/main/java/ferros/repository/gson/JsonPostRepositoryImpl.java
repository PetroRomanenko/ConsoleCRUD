package ferros.repository.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ferros.model.Post;
import ferros.repository.PostRepository;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class JsonPostRepositoryImpl implements PostRepository {

    private final Gson gson = new Gson();
    private final String POST_FILE_LOCATION = "src/main/resources/posts.json";
    private final Path POST_FILE_PATH = Path.of(POST_FILE_LOCATION);

    private List<Post>  getAllPostInternal(){
        try {
            String jsonString = Files.readString(POST_FILE_PATH);
            Type typeOfList = new TypeToken<ArrayList<Post>>(){}.getClass();
            return gson.fromJson(jsonString,typeOfList);
        }catch (IOException e){
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private void writePostsToFile(List<Post> posts){
        try{
            String postsJson = gson.toJson(posts);
            Files.write(POST_FILE_PATH,postsJson.getBytes());
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to read posts.json");
        }
    }
    private Integer generateId(List<Post> posts){
        Post postWithMaxId = posts.stream().max(Comparator.comparing(Post::getId)).orElse(null);
        return Objects.nonNull(postWithMaxId)?postWithMaxId.getId()+1:1;
    }
    @Override
    public Post getById(Integer id) {
        List<Post> postList = getAllPostInternal();
        return postList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Post> getAll() {
        return getAllPostInternal();
    }

    private Long getCurrentTime(Post post){
        return new Date().getTime();
    }
    @Override
    public Post save(Post post) {
        List<Post> postList = getAllPostInternal();
        Integer newId = generateId(postList);

        post.setId(newId);
        post.setCreated(getCurrentTime(post));

        postList.add(post);
        writePostsToFile(postList);
        return post;
    }

    @Override
    public Post update(Post post) {
        List<Post> postList = getAllPostInternal();
        for (Post postItr:postList       ) {
            if (postItr.getId().equals(post.getId())){
                postItr.setContent(post.getContent());
                postItr.setUpdated(getCurrentTime(post));
            }
        }
        writePostsToFile(postList);
        return post;
    }

    @Override
    public void deleteById(Integer id) {
        List<Post> postList = getAllPostInternal();
        postList.removeIf(post -> post.getId().equals(id));
        writePostsToFile(postList);

    }

    @Override
    public void printList(List<Post> postList) {
        int count = 1;
        for(Post post: postList){
            System.out.println(count+ ". "+ post);
            count++;
        }

    }
}
