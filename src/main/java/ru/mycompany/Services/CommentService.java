package ru.mycompany.Services;

import ru.mycompany.Database.Entity.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
    List<Comment> listComment();
    void removeComment(Comment comment);
    Comment findById(int id);
}
