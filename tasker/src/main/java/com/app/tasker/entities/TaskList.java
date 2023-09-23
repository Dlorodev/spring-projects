package com.app.tasker.entities;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private List<Task> taskList;

    //Metodos constructores (vacio y con parametros)
    public TaskList() {
    }

    public TaskList(String name) {
        this.name = name;
        this.taskList = new ArrayList<Task>();
    }

    //Getters
    public String getName(){
        return name;
    }

    public List<Task> getTaskList(){
        return taskList;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Metodo para agregar una tarea a taskList
    public void addTask(Task task){
        this.taskList.add(task);
    }

}
