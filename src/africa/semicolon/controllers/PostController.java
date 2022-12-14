package africa.semicolon.controllers;

import africa.semicolon.data.models.Post;
import africa.semicolon.dtos.request.CreatePostRequest;
import africa.semicolon.services.PostService;
import africa.semicolon.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private PostService postService = new PostServiceImpl();

    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
        return "Successful";
    }

    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable int postId){
     return postService.viewPost(postId);
    }
}
