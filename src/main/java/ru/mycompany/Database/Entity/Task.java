package ru.mycompany.Database.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = true)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "USER_ID")
    private String user_id;
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Column(name = "IMPORTANCE")
    private String importance;
    public String getImportance() {
        return importance;
    }
    public void setImportance(String importance) {
        this.importance = importance;
    }

    @Column(name = "TEXT_TASK")
    private String text_task;
    public String getText_task() {
        return text_task;
    }
    public void setText_task(String text_task) {
        this.text_task = text_task;
    }

    @Column(name = "DATA_CREATE")
    private Date data_create;
    public Date getData_create() {
        return data_create;
    }
    public void setData_create(Date data_create) {
        this.data_create = data_create;
    }

    @Column(name = "DATA_END")
    private String data_end;
    public String getData_end() {
        return data_end;
    }
    public void setData_end(String data_end) {
        this.data_end = data_end;
    }

    @Column(name = "WHO_END")
    private String who_end;
    public String getWho_end() {
        return who_end;
    }
    public void setWho_end(String who_end) {
        this.who_end = who_end;
    }

    @ManyToOne
    @JoinColumn (name = "USER_ID", nullable = false, insertable = false, updatable = false)
    private User user;
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public Task() {}

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", importance='" + importance + '\'' +
                ", text_task='" + text_task + '\'' +
                ", data_create=" + data_create +
                ", data_end='" + data_end + '\'' +
                ", who_end='" + who_end + '\'' +
                '}';
    }
}
