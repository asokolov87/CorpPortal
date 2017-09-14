package ru.mycompany.Services;

import ru.mycompany.Database.Entity.Task;

import java.util.List;

/**
 * Created by sokolov on 11.04.2017.
 */
public interface TasksService {

    void addTask(Task task);
    List<Task> listTasks();
    Task findById(int id);
    void removeTask(Task task);
}
