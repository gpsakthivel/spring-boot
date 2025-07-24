package com.example.rest_api.todo.controller;

import com.example.rest_api.todo.dtos.TodoDto;
import com.example.rest_api.todo.entities.Todo;
import com.example.rest_api.todo.repositories.TodoRepo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping("/todos")
    public List<Todo> todos(@RequestParam Optional<Boolean> completed) {
        return completed.map(c -> this.todoRepo.findAllByCompleted(c))
                .orElseGet(() -> this.todoRepo.findAll());
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<Todo> getTodos(@PathVariable Long id) {
        return this.todoRepo.findById(id)
                .map(todo -> ResponseEntity.ok().body(todo))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/todos")
    public ResponseEntity<Object> addTodo(@Valid @RequestBody TodoDto todoDto) {
        this.todoRepo.save(new Todo(null, todoDto.getTask(), false));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/todos/{id}")
    public ResponseEntity<Object> updateTodo(@PathVariable Long id, @Valid @RequestBody TodoDto todoDto) {
        return this.todoRepo.findById(id)
                .map(todo -> {
                    todo.setTask(todoDto.getTask());
                    this.todoRepo.save(todo);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/todos/{id}/mark_completed")
    public ResponseEntity<Object> markComplete(@PathVariable Long id) {
        return this.todoRepo.findById(id)
                .map(todo -> {
                    todo.setCompleted(true);
                    this.todoRepo.save(todo);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/todos/{id}/mark_incompleted")
    public ResponseEntity<Object> markIncomplete(@PathVariable Long id) {
        return this.todoRepo.findById(id)
                .map(todo -> {
                    todo.setCompleted(false);
                    this.todoRepo.save(todo);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<Object> addTodo(@PathVariable Long id, @Valid @RequestBody TodoDto todoDto) {
        return this.todoRepo.findById(id)
                .map(todo -> {
                    this.todoRepo.delete(todo);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
