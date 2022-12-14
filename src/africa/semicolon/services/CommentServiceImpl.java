package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.repositories.CommentRepository;
import africa.semicolon.dtos.request.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{


    @Autowired
    private PostService postService;
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
            Comment comment = new Comment();
            comment.setComment(comment.getComment());
            comment.setCommenterName(createCommentRequest.getCommenterName());
            Comment savedComment = commentRepository.save(comment);
            postService.addComment(createCommentRequest.getPostId(), savedComment);
    }

    @Override
    public List<Comment> viewAll() {
        return commentRepository.findAll();
    }
}
