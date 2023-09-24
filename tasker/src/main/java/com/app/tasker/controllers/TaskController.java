package com.app.tasker.controllers;

import com.app.tasker.entities.Task;
import com.app.tasker.entities.TaskList;
import com.app.tasker.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
public class TaskController {

    TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }

    /*
    @GetMapping("/tasks")
    public List<Task> taskList() {
        return this.service.getTaskList();
    }
    */

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task){
        return this.service.createTask(task);
    }

}
