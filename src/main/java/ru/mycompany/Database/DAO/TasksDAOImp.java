package ru.mycompany.Database.DAO;

import ru.mycompany.Database.Entity.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("taskDao")
public class TasksDAOImp implements TasksDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public TasksDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional (readOnly = true)
    public Task showTaskById(int id) {return (Task) sessionFactory.getCurrentSession().get(Task.class, id);}

    @Transactional (readOnly = true)
    public List listTasks(){return sessionFactory.getCurrentSession().createQuery("from Task t").list();}

    public void addTask(Task task){sessionFactory.getCurrentSession().saveOrUpdate(task);}

    public void removeTask(Task task) {sessionFactory.getCurrentSession().delete(task);}
}



    /*
    Using JDBC

    private static final String url = "jdbc:mysql://localhost:3306/HelpDesk";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;


    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user,password);
    }

    public List<Task> selectAll() throws SQLException{
        String query = "select * from task";
        con = getConnection();
        List<Task> list = new ArrayList<Task>();
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        while (rs.next())
        {
            Task task = new Task();
            task.setTask_id(rs.getInt(1));
            task.setWlogin(rs.getString(2));
            task.setPrioritet(rs.getString(3));
            task.setText_task(rs.getString(4));
            task.setData_create(rs.getString(5));
            task.setData_end(rs.getString(6));
            task.setWho_end(rs.getString(7));
            list.add(task);
        }
        con.close();
        stmt.close();
        rs.close();
        return list;
    }*/