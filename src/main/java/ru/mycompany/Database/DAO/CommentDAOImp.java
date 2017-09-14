package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.Comment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("commentDao")
public class CommentDAOImp implements CommentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List listComment() {
        return sessionFactory.getCurrentSession().createQuery("from Comment c").list();
    }

    @Transactional(readOnly = true)
    public Comment findById(int id) {
        return sessionFactory.getCurrentSession().get(Comment.class, id);
    }

    public void addComment(Comment comment) {
        sessionFactory.getCurrentSession().saveOrUpdate(comment);
    }

    public void removeComment(Comment comment) {
        sessionFactory.getCurrentSession().delete(comment);
    }
}
