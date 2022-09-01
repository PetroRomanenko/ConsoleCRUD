package ferros.repository.gson;

import com.google.gson.Gson;
import ferros.model.Post;
import ferros.repository.PostRepository;

import java.util.List;

public class JsonPostRepositoryImpl implements PostRepository {

    private final Gson gson = new Gson();
    private
    @Override
    public Post getById(Integer id) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void printList(List<Post> list) {

    }
}
