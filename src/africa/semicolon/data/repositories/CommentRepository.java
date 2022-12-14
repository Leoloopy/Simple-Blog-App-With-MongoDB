package africa.semicolon.data.repositories;


import africa.semicolon.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CommentRepository extends MongoRepository<Comment, String> {

}
