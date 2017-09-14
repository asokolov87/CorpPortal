package ru.mycompany.Services;

import ru.mycompany.Database.DAO.TasksDAO;
import ru.mycompany.Database.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("taskService")
public class TasksServiceImp implements TasksService {

    private final TasksDAO tasksDAO;

    @Autowired
    public TasksServiceImp(TasksDAO tasksDAO) {
        this.tasksDAO = tasksDAO;
    }

    @Override
    @Transactional
    public void addTask(Task task) {
        this.tasksDAO.addTask(task);
    }

    @Override
    @Transactional
    public List listTasks() {
        return this.tasksDAO.listTasks();
    }

    @Override
    @Transactional
    public Task findById(int id) {
        return this.tasksDAO.showTaskById(id);
    }

    @Override
    @Transactional
    public void removeTask(Task task) {
        this.tasksDAO.removeTask(task);
    }
}
