package africa.semicolon.dtos.request;


import lombok.Data;

@Data
public class CreateCommentRequest {
    private int postId;
    private String commenterName;
    private String comment;
}
