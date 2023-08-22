package org.example.model;


import javax.persistence.*;

@Entity             // OBLIGE EN JPA
@Table(name= "tasks")  // OBLIGE JPA
public class Task {

    @Id           // OBLIGE JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY) //OBLIGE JPA
    private Long id;

    private String title;

    private boolean completed;
    @OneToOne(mappedBy = "task")
    private TaskInfo taskInfo;
    public Task() {                   // Constructeur Vide OBLIGE JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
