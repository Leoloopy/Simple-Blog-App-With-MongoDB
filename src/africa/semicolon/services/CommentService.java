package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.dtos.request.CreateCommentRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {
    void createComment(CreateCommentRequest createCommentRequest);
    List<Comment> viewAll();

}
