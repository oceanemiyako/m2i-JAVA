package org.example.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "taskInfo")
public class TaskInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tasks_id")
    private Task task;

    private LocalDate date;

    private int priority;

    public TaskInfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "TaskInfo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", task=" + task +
                ", date=" + date +
                ", priority=" + priority +
                '}';
    }
}

