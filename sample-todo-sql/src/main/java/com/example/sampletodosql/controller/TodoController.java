package com.example.sampletodosql.controller;

import com.example.sampletodosql.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Collection;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public @ResponseBody Collection<Todo> getAllTodos() {
        return Arrays.asList(new Todo("1","title", "description", false));
    }
}
