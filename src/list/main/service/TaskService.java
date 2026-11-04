package service;
import domain.Task;

import java.util.ArrayList;



public class TaskService {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String name, String description){
        Task task = new Task(name, description);
        tasks.add(task);
    }

    

}
