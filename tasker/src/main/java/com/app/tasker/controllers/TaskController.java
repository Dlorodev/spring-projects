package com.app.tasker.controllers;

import com.app.tasker.entities.Task;
import com.app.tasker.entities.TaskList;
import com.app.tasker.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TaskController {

    TaskService service;

    public TaskController(){
        this.service = new TaskService();
    }

    @GetMapping("/tasks")
    public TaskList taskList() {
        return this.service.getTaskList();
    }

}
