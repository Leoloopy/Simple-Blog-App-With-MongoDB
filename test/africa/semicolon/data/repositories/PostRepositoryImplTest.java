/*
package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;
import africa.semicolon.dtos.request.CreatePostRequest;
import africa.semicolon.services.PostService;
import africa.semicolon.services.PostServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepositoryImplTest {
    private PostRepository postRepository;
    private PostService postService;

    @BeforeEach
    void setUp() {

        postRepository = new PostRepositoryImpl();
        postService = new PostServiceImpl();

    }

    @Test
    public void saveNewPost_countShouldBeOne_Test(){
      Post post = new Post();
      post.setBody("Our post body");
      post.setTitle("our post title");

      postRepository.save(post);
      assertEquals(1L, postRepository.count());
    }

    @Test
    public void saveNewPost_findById_shouldReturnSavePostTest(){
        Post post = new Post();
        post.setBody("Our post body");
        post.setTitle("our post title");

        postRepository.save(post);
        assertEquals(1L, postRepository.count());

        Post savedPost  = postRepository.findById(1);
        assertEquals(post, savedPost);

    }

    @Test
    public void saveNewPost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setTitle("our post title");
        post.setBody("our post body");
        postRepository.save(post);

        Post updatedPost  = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("Updated body");
        updatedPost.setTitle("Updated title");
        postRepository.save(updatedPost);

        assertEquals(1L, postRepository.count());
        assertEquals(post, postRepository.findById(1));

        assertEquals("Updated body", post.getBody());
        assertEquals("Updated title", post.getTitle());

    }

    @Test
    public void deleteItem_countIsZeroTest(){
        Post post1 = new Post();
        post1.setBody("our post body");
        post1.setTitle("our post title");
        postRepository.save(post1);
        assertEquals(1L, postRepository.count());


        Post post2 = new Post();
        post2.setTitle("second post title");
        post2.setBody("second post body");
        postRepository.save(post2);
        assertEquals(2L, postRepository.count());

        Post post3 = new Post();
        post3.setTitle("third post title");
        post3.setBody("third post body");
        postRepository.save(post3);
        assertEquals(3L, postRepository.count());

        Post post4 = new Post();
        post4.setTitle("fourth post title");
        post4.setBody("fourth post body");
        postRepository.save(post4);
        assertEquals(4L, postRepository.count());

        postRepository.delete(post3.getId());
        assertEquals(3L, postRepository.count());

        Post post5 = new Post();
        post5.setTitle("fifth post title");
        post5.setBody("fifth post title");
        postRepository.save(post5);

        assertEquals(4L, postRepository.count());
        assertEquals(5, post5.getId());
        }

    @Test
    public void testThatPostCanBeDeletedByPost(){
        Post post1 = new Post();
        post1.setBody("My first body Post");
        post1.setTitle("My first title Post");
        postRepository.save(post1);

        Post post2 = new Post();
        post2.setBody("My first body Post");
        post2.setTitle("My first title Post");
        postRepository.save(post2);

        Post post3 = new Post();
        post3.setBody("My first body Post");
        post3.setTitle("My first title Post");
        postRepository.save(post3);

        assertEquals(3L, postRepository.count());

        postRepository.delete(post2);
        assertEquals(2L, postRepository.count());

    }

    @Test
    public void addCommentTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Post Body");
        createPostRequest.setTitle("Post Title");
        postService.createPost(createPostRequest);


        Comment comment = new Comment();
        comment.setComment("I love your post");
        postService.addComment(1, comment);

        Post savedPost = postService.viewPost(1);
        assertEquals(1, savedPost.getComments().size());
        assertEquals("I love your post", savedPost.getComments().get(0).getComment());

    }

}

*/