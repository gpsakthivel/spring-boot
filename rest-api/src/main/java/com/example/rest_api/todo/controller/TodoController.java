package com.example.rest_api.todo.controller;

import com.example.rest_api.todo.dtos.TodoDto;
import com.example.rest_api.todo.entities.Todo;
import com.example.rest_api.todo.repositories.TodoRepo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping("/todos")
    public List<Todo> root() {
        return this.todoRepo.findAll();
    }

    @PostMapping("/todos")
    public ResponseEntity<Object> addTodo(@Valid @RequestBody TodoDto todoDto) {
        this.todoRepo.save(new Todo(null, todoDto.getTask(), false));
        return ResponseEntity.ok().build();
    }
//
//    @GetMapping("/todos")
//    public List<Todo> root() {
//        return this.todoRepo.findAll();
//    }
//
//    @GetMapping("/todos")
//    public List<Todo> root() {
//        return this.todoRepo.findAll();
//    }
//
//    @GetMapping("/todos")
//    public List<Todo> root() {
//        return this.todoRepo.findAll();
//    }
//
//    @GetMapping("/todos")
//    public List<Todo> root() {
//        return this.todoRepo.findAll();
//    }
}
