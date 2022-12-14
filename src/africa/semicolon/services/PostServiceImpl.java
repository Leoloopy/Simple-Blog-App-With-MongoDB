package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;
import africa.semicolon.data.repositories.PostRepository;
import africa.semicolon.data.repositories.PostRepositoryImpl;
import africa.semicolon.dtos.request.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements PostService{

    private PostRepository postRepository = new PostRepositoryImpl();

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);
    }

    @Override
    public void updatePost(int id, String title, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
       return  postRepository.findById(id);
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(int postId, Comment comment) {

    }
}
