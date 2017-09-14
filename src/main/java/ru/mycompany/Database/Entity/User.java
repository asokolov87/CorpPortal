package ru.mycompany.Database.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findByUsername", query = "select distinct u from User u where u.username = :username")
})
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "username")
    private String username;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "NAME")
    private String NAME;
    public String getNAME() {return NAME;}
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Column(name = "EMAIL")
    private String EMAIL;
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    public String getEMAIL() {
        return EMAIL;
    }

    @Column(name = "POSITION")
    private String POSITION;
    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }
    public String getPOSITION() {
        return POSITION;
    }

    @Column(name = "OTDEL")
    private String OTDEL;
    public void setOTDEL(String OTDEL) {
        this.OTDEL = OTDEL;
    }
    public String getOTDEL() {
        return OTDEL;
    }

    @Column(name = "MOB_TEL")
    private String MOB_TEL;
    public void setMOB_TEL(String MOB_TEL) {
        this.MOB_TEL = MOB_TEL;
    }
    public String getMOB_TEL() {
        return MOB_TEL;
    }

    @Column(name = "V_TEL")
    private String V_TEL;
    public void setV_TEL(String V_TEL) {
        this.V_TEL = V_TEL;
    }
    public String getV_TEL() {
        return V_TEL;
    }

   /* @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Task> tasks;
    public Set<Task> getTasks() {return this.tasks;}
    public void setTasks(Set<Task> tasks) {this.tasks = tasks;}
    public void addTask(Task task){
        task.setUser(this);
        getTasks().add(task);
    }
    public void removeTask (Task task){getTasks().remove(task);}

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments;
    public Set<Comment> getComments() {return comments;}
    public void removeComment (Comment comment){getComments().remove(comment);}
    public void setComments(Set<Comment> comments) {this.comments = comments;}
    public void addComment(Comment comment){
        comment.setUser(this);
        getComments().add(comment);
    }*/


    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Role> roles = new HashSet<Role>();
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {this.roles = roles;}
    public void removeRole(Role role){getRoles().remove(role);}
    public void addRole(Role role){
        role.setUsers(this);
        getRoles().add(role);
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", NAME='" + NAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", POSITION='" + POSITION + '\'' +
                ", OTDEL='" + OTDEL + '\'' +
                ", MOB_TEL='" + MOB_TEL + '\'' +
                ", V_TEL='" + V_TEL + '\'' +
                '}';
    }
}