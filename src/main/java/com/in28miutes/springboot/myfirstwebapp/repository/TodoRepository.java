package com.in28miutes.springboot.myfirstwebapp.repository;

import com.in28miutes.springboot.myfirstwebapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TodoRepository {
    private static List<Todo> todoList = new ArrayList<>();

    static {
        todoList.add(new Todo(1, "kim","Learn JAVA", LocalDate.now().plusYears(1),false));
        todoList.add(new Todo(2, "sang","Learn CSS", LocalDate.now().plusYears(2),false));
        todoList.add(new Todo(3, "Gyun","Learn JAVAcript", LocalDate.now().plusYears(3),false));
        todoList.add(new Todo(4, "kim","Learn JAVAScript", LocalDate.now().plusYears(1),false));

    }

    public List<Todo> findByName(String name){
        return todoList.stream().filter(todo -> todo.getUserName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

}
