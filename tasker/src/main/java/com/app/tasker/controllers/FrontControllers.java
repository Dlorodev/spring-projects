package com.app.tasker.controllers;

import com.app.tasker.entities.Task;
import com.app.tasker.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControllers {

    TaskService service;

    public FrontControllers(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<Task> tasks = this.service.getTaskList();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
