package com.example.todoList.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String name;
    private String description;
    //    @ManyToOne
    //    @JoinColumn(name = "category_id")
    //    private Category category;
    private boolean isComplete;

    public Task(String category, String name, String description) {

        this.name = name;
        this.description = description;
        this.isComplete = false;
    }

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
