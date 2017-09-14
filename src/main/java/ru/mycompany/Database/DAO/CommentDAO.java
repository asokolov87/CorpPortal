package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.Comment;

import java.util.List;

public interface CommentDAO {
    void addComment(Comment comment);
    List<Comment> listComment();
    void removeComment(Comment comment);
    Comment findById(int id);
}
