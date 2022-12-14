/*
package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {

    private CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    public void saveNewComment_countShouldBeOne_Test(){
        Comment comment = new Comment();
        comment.setComment("Our comment body");
        comment.setCommenterName("our comment name");

        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());
    }

    @Test
    public void saveNewComment_findById_shouldReturnSaveCommentTest(){
        Comment comment = new Comment();
        comment.setComment("Our comment body");
        comment.setCommenterName("our comment name");

        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());

        Comment savedComment  = commentRepository.findById(1);
        assertEquals(comment, savedComment);

    }

    @Test
    public void saveNewComment_updateComment_countIsOneTest(){
        Comment comment = new Comment();
        comment.setCommenterName("our comment name");
        comment.setComment("our comment body");
        commentRepository.save(comment);

        Comment updatedComment  = new Comment();
        updatedComment.setId(1);
        updatedComment.setComment("Updated body");
        updatedComment.setCommenterName("Updated name");
        commentRepository.save(updatedComment);

        assertEquals(1L, commentRepository.count());
        assertEquals(comment, commentRepository.findById(1));

        assertEquals("Updated body", comment.getComment());
        assertEquals("Updated name", comment.getCommenterName());

    }

    @Test
    public void deleteItem_countIsZeroTest(){
        Comment comment1 = new Comment();
        comment1.setComment("our comment body");
        comment1.setCommenterName("our comment name");
        commentRepository.save(comment1);
        assertEquals(1L, commentRepository.count());


        Comment comment2 = new Comment();
        comment2.setCommenterName("second comment name");
        comment2.setComment("second comment body");
        commentRepository.save(comment2);
        assertEquals(2L, commentRepository.count());

        Comment comment3 = new Comment();
        comment3.setCommenterName("third comment name");
        comment3.setComment("third comment body");
        commentRepository.save(comment3);
        assertEquals(3L, commentRepository.count());

        Comment comment4 = new Comment();
        comment4.setCommenterName("fourth comment name");
        comment4.setComment("fourth comment body");
        commentRepository.save(comment4);
        assertEquals(4L, commentRepository.count());

        commentRepository.delete(comment3.getId());
        assertEquals(3L, commentRepository.count());

        Comment comment5 = new Comment();
        comment5.setCommenterName("fifth comment name");
        comment5.setComment("fifth comment name");
        commentRepository.save(comment5);

        assertEquals(4L, commentRepository.count());
        assertEquals(5, comment5.getId());
    }

    @Test
    public void testThatCommentCanBeDeletedByComment(){
        Comment comment1 = new Comment();
        comment1.setComment("My first body Comment");
        comment1.setCommenterName("My first name Comment");
        commentRepository.save(comment1);

        Comment comment2 = new Comment();
        comment2.setComment("My first body Comment");
        comment2.setCommenterName("My first name Comment");
        commentRepository.save(comment2);

        Comment comment3 = new Comment();
        comment3.setComment("My first body Comment");
        comment3.setCommenterName("My first name Comment");
        commentRepository.save(comment3);

        assertEquals(3L, commentRepository.count());

        commentRepository.delete(comment2);
        assertEquals(2L, commentRepository.count());


    }
}
 */