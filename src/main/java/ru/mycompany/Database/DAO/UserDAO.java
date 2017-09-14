package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.User;

import java.util.List;

public interface UserDAO {

    List<User> listUsers();

    User findById(int id);

    void removeUser(User user);

    void saveOrUpdateUser(User user);

    User findByUsername(String username);

}
