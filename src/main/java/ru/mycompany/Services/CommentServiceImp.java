package ru.mycompany.Services;

import ru.mycompany.Database.DAO.CommentDAO;
import ru.mycompany.Database.Entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("commentService")
public class CommentServiceImp implements CommentService {

    private final CommentDAO commentDAO;

    @Autowired
    public CommentServiceImp(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    @Override
    @Transactional
    public void addComment(Comment comment) {
        this.commentDAO.addComment(comment);
    }

    @Override
    @Transactional
    public List<Comment> listComment() {
        return this.commentDAO.listComment();
    }

    @Override
    @Transactional
    public Comment findById(int id) {
        return this.commentDAO.findById(id);
    }

    @Override
    @Transactional
    public void removeComment(Comment comment) {
        this.commentDAO.removeComment(comment);
    }
}
