package com.example.todoList.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;



@Entity(name = "user_profile")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
