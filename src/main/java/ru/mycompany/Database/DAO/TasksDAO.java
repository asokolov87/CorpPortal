package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.Task;

import java.util.List;

public interface TasksDAO {
    void addTask(Task task);
    List listTasks();
    void removeTask(Task task);
    Task showTaskById(int id);
}
