package com.example.rest_api.todo.repositories;

import com.example.rest_api.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {
    public List<Todo> findAllByCompleted(Boolean completed);
}
