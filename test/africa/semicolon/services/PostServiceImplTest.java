
/*
package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.dtos.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {
    private PostService postService;

    @BeforeEach
    void setUp() {
        postService = new PostServiceImpl();
    }

    @Test
    public void createPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is bad for the body");
        createPostRequest.setTitle("New Post");
        postService.createPost(createPostRequest );
        assertEquals(1, postService.viewAllPost().size());
    }

    @Test
    public void viewPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is bad for the body");
        createPostRequest.setTitle("New Post");
        postService.createPost(createPostRequest );
        assertEquals(1, postService.viewAllPost().size());

        Post post  = postService.viewPost(1);
        assertEquals("New Post", post.getTitle());
        assertEquals("Egusi is bad for the body", post.getBody());
        assertNotNull(post.getCreationDate());
    }
}
 */