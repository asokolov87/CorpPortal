package ru.mycompany.Services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.mycompany.Database.DAO.UserDAO;
import ru.mycompany.Database.Entity.Role;
import ru.mycompany.Database.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImp implements UserService {

    private final BCryptPasswordEncoder bcryptEncoder;
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO, BCryptPasswordEncoder bcryptEncoder) {
        this.userDAO = userDAO;
        this.bcryptEncoder = bcryptEncoder;
    }

    @Override
    @Transactional
    public void saveOrUpdateUser(User user) {
        boolean i = false;

        for (Role r: user.getRoles()) {
            if(r.getRole().equals("ROLE_USER")){ i = true; }
        }
        if(!i){
        Role role = new Role();
        role.setRole("ROLE_USER");
        role.setUsers(user);
        user.addRole(role);
        }
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        this.userDAO.saveOrUpdateUser(user);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.userDAO.listUsers();
    }

    @Override
    @Transactional
    public User findById(int id) {
        return this.userDAO.findById(id);
    }

    @Override
    @Transactional
    public void removeUser(User user) {
        this.userDAO.removeUser(user);
    }
}
