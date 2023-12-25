package com.example.todoList.controller;

import com.example.todoList.entity.Task;
import com.example.todoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @GetMapping("")
    public @ResponseBody Iterable<Task> getAll() {
        return repository.findAll();
    }

    @PostMapping("/add")
    public @ResponseBody ResponseEntity<HttpStatus> addItem(@RequestParam String name,
                                                            @RequestParam String category,
                                                            @RequestParam String description) {
        var item = new Task(category, name, description);
        repository.save(item);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public @ResponseBody ResponseEntity<HttpStatus> updateItem(@RequestParam String name,
                                                               @RequestParam String category,
                                                               @RequestParam String description) {
        var item = new Task(category, name, description);
        repository.save(item);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
