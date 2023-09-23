package com.app.tasker.entities;

import java.time.LocalDate;

public class Task {

    private String description;
    private boolean isDone;
    private LocalDate dueDate;

    //Metodos constructores (vacio y con atributos)
    public Task() {
    }

    public Task(String description, boolean isDone, LocalDate dueDate) {
        this.description = description;
        this.isDone = isDone;
        this.dueDate = dueDate;
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    //Setters
    public void setDescription(String description){
        description = this.description;
    }

    public void setDone(boolean isDone) {
        isDone = this.isDone;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
