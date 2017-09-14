package ru.mycompany.Services;

import ru.mycompany.Database.Entity.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();
    User findById(int id);
    void removeUser(User user);
    void saveOrUpdateUser(User user);
}
