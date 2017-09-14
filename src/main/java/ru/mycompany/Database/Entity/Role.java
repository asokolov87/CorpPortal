package ru.mycompany.Database.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "role")
    private String Role;
    public String getRole() {
        return Role;
    }
    public void setRole(String Role) { this.Role = Role; }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User users;
    public User getUsers() {
        return users;
    }
    public void setUsers(User users) {
        this.users = users;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role= " + Role;
    }
}
