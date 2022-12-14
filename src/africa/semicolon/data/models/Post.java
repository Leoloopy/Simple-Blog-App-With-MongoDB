package africa.semicolon.data.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String title;
    private int id;
    private LocalDateTime creationDate = LocalDateTime.now();
    private String body;
    private List<Comment> comments = new ArrayList<>();
}
