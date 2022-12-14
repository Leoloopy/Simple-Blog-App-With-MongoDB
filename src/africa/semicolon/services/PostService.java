package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;
import africa.semicolon.dtos.request.CreatePostRequest;

import java.util.List;

public interface PostService {
    void createPost(CreatePostRequest createPostRequest);
    void updatePost(String id, String title, String body);
    void deletePost(String id);
    Post viewPost(String id);
    List<Post> viewAllPost();
    void addComment(String postId, Comment comment);
}
