package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDAOImp implements UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List listUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User u").list();
    }

    public User findById(int id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    public void saveOrUpdateUser(User user) {
        sessionFactory.getCurrentSession().merge(user);
    }

    public void removeUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    public User findByUsername(String username) {
        return (User) sessionFactory.getCurrentSession().getNamedQuery("User.findByUsername").setParameter("username", username).uniqueResult();
    }
}
