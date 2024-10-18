package com.harshee.todolist.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController("/")
public class TodoController {


    @GetMapping
    public ResponseEntity<List<String>> getAllTodoList(){
        List<String> todoList = new ArrayList<>(Arrays.asList("Task 1","Task 2","Task 3"));
        return ResponseEntity.ok(todoList);
    }

}
