package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;
import africa.semicolon.dtos.request.CreatePostRequest;

import java.util.List;

public interface PostService {
    void createPost(CreatePostRequest createPostRequest);
    void updatePost(int id, String title, String body);
    void deletePost(int id);
    Post viewPost(int id);
    List<Post> viewAllPost();
    void addComment(int postId, Comment comment);
}
