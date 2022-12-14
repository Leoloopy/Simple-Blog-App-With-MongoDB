package africa.semicolon.dtos.request;


import lombok.Data;

@Data
public class CreateCommentRequest {
    private String postId;
    private String commenterName;
    private String comment;
}
