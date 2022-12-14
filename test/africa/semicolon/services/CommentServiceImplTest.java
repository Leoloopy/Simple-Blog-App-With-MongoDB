/*
package africa.semicolon.services;

import africa.semicolon.dtos.request.CreateCommentRequest;
import africa.semicolon.dtos.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentServiceImplTest {
    private CommentService commentService;
    private PostService postService;

    @BeforeEach
    void setUp() {
        commentService = new CommentServiceImpl();
        postService  = new PostServiceImpl();
    }

    @Test
    public void createCommentTest(){
        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        createCommentRequest.setCommenterName("Ojo");
        createCommentRequest.setPostId(1);
        createCommentRequest.setComment("I love your useless post");

        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle("title");
        createPostRequest.setBody("Body");
        postService.createPost(createPostRequest);
        commentService.createComment(createCommentRequest);

        assertEquals(1, commentService.viewAll().size());


    }
}

 */