package africa.semicolon.data.models;

import lombok.Data;

@Data
public class Comment {
    private String commenterName;
    private int id;
    private String comment;

}
