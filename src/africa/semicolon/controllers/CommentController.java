package africa.semicolon.controllers;

import africa.semicolon.dtos.request.CreateCommentRequest;
import africa.semicolon.dtos.request.CreatePostRequest;
import africa.semicolon.services.CommentService;
import africa.semicolon.services.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    private String addComment(@RequestBody CreateCommentRequest createCommentRequest){
        commentService.createComment(createCommentRequest);
        return "Comment added";
    }

}
