package com.app.tasker.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "isDone")
    private boolean isDone;
    @Column(name = "dueDate")
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
