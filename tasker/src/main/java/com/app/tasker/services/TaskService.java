package com.app.tasker.services;

import com.app.tasker.entities.Task;
import com.app.tasker.entities.TaskList;
import com.app.tasker.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private TaskRepository repository;

    //Metodo constructor
    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    //Getter
    public List<Task> getTaskList(){
        return this.repository.findAll();
    }

    public Task createTask(Task newTask){
        return this.repository.save(newTask);
    }

    public boolean markFinished(Long id){
        Optional<Task> task = this.repository.findById(id);
        if(task.isPresent()){
            task.get().setDone(true);
            this.repository.save(task.get());
            return true;
        }
        return false;
    }

    public boolean deleteTask(Long id){
        this.repository.deleteById(id);
        return true;
    }
}
