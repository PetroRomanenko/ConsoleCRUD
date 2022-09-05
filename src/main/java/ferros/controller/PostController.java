package ferros.controller;

import ferros.model.Post;
import ferros.repository.PostRepository;
import ferros.repository.gson.JsonPostRepositoryImpl;

import java.lang.module.FindException;
import java.util.List;

public class PostController {
    private final PostRepository postRepository = new JsonPostRepositoryImpl();

    public Post savePost(String content){
        Post post = new Post(null,content);
        return postRepository.save(post);
    }

    public Post findPostById(Integer id){
        return postRepository.getById(id);
    }

    public List<Post> getAllPosts(){
        return postRepository.getAll();
    }

    public Post update(Post post){
        postRepository.update(post);
        return  post;
    }

    public void deletePostById(Integer id){
        postRepository.deleteById(id);
    }

    public void printPostList(List<Post> post){
        postRepository.printList(post);
    }
}
