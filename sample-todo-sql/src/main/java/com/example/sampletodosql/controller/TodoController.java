package com.example.sampletodosql.controller;

import com.example.sampletodosql.model.CreateTodoRequest;
import com.example.sampletodosql.model.CreateTodoResponse;
import com.example.sampletodosql.model.GenericResponse;
import com.example.sampletodosql.model.Todo;
import com.example.sampletodosql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public @ResponseBody Collection<Todo> getAllTodos() {
        return todoService.getAllTodo();
    }

    @PostMapping
    public @ResponseBody GenericResponse<CreateTodoResponse> createTodo(@RequestBody CreateTodoRequest request) {
        Todo todo = new Todo(request.title, request.description);
        boolean success = todoService.createTodo(todo);
        if(success) return GenericResponse.successWithData(new CreateTodoResponse());
        return GenericResponse.failureWithError(new Exception("Fail to create todo"));
    }
}
