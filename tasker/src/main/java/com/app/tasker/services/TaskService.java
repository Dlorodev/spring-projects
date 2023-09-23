package com.app.tasker.services;

import com.app.tasker.entities.Task;
import com.app.tasker.entities.TaskList;

import java.time.LocalDate;

public class TaskService {

    Task task1;
    Task task2;
    TaskList purposes;

    //Metodo constructor
    public TaskService(){
        this.task1 = new Task("Aprender Java", false, LocalDate.of(2023,9,28));
        this.task2 = new Task("Aprender SpringBoot", false, LocalDate.of(2023,10,10));
        this.purposes = new TaskList("Propositos del 2023");
        purposes.addTask(task1);
        purposes.addTask(task2);
    }

    //Getter
    public TaskList getTaskList(){
        return this.purposes;
    }
}
