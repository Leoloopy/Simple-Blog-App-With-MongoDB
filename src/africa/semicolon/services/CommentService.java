package africa.semicolon.services;

import africa.semicolon.dtos.request.CreateCommentRequest;

public interface CommentService {

    void createComment(CreateCommentRequest createCommentRequest);

}
