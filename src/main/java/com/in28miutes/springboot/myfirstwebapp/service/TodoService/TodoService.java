package com.in28miutes.springboot.myfirstwebapp.service.TodoService;

import com.in28miutes.springboot.myfirstwebapp.entity.Todo;
import com.in28miutes.springboot.myfirstwebapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findByName(String name){
        return todoRepository.findByName(name);
    }
}
