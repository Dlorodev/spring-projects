package com.app.tasker.controllers;

import com.app.tasker.entities.Task;
import com.app.tasker.entities.TaskList;
import com.app.tasker.services.TaskService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView createTask(@ModelAttribute Task task, Model model){
        model.addAttribute(task);
        task.setDone(false);
        this.service.createTask(task);
        return new RedirectView("/tasks");
    }

    @PatchMapping("/tasks/{id}")
    public RedirectView updateTask(@PathVariable("id") Long id){
        this.service.markFinished(id);
        return new RedirectView("/tasks");
    }

    @DeleteMapping("/tasks/{id}")
    public RedirectView deleteTask(@PathVariable("id") Long id){
        this.service.deleteTask(id);
        return new RedirectView("/tasks");
    }

}
