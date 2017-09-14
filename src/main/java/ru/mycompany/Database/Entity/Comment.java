package ru.mycompany.Database.Entity;

/*POJO class for database. Table comments*/

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = true)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "USER_ID")
    private String users_id;
    public String getUsers_id() {
        return users_id;
    }
    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    @Column(name = "TASK_ID")
    private int task_id;
    public int getTask_id() {
        return task_id;
    }
    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    @Column(name = "TEXT_COMMENT")
    private String text_comment;
    public String getText_comment() {
        return text_comment;
    }
    public void setText_comment(String text_comment) {
        this.text_comment = text_comment;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_POST")
    private Date data_post;
    public Date getData_post() {
        return data_post;
    }
    public void setData_post(Date data_post) {
        this.data_post = data_post;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false, insertable = false, updatable = false)
    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn (name = "TASK_ID", nullable = false, insertable = false, updatable = false)
    private Task task;
    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", users_id='" + users_id + '\'' +
                ", task_id=" + task_id +
                ", text_comment='" + text_comment + '\'' +
                ", data_post=" + data_post +
                '}';
    }
}
