package com.example.sampletodosql.service;

import com.example.sampletodosql.model.Todo;
import com.example.sampletodosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(String id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            return todo.get();
        }
        return null;
    }

    public boolean createTodo(Todo todo) {
        try {
            todoRepository.save(todo);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}