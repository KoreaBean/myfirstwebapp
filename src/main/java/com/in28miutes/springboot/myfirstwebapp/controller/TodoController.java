package com.in28miutes.springboot.myfirstwebapp.controller;

import com.in28miutes.springboot.myfirstwebapp.authentication.AuthenticationService;
import com.in28miutes.springboot.myfirstwebapp.entity.Todo;
import com.in28miutes.springboot.myfirstwebapp.service.TodoService.TodoService;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {



    private AuthenticationService authenticationService;
    private TodoService todoService;


    public TodoController(AuthenticationService authenticationService, TodoService todoService) {
        this.authenticationService = authenticationService;
        this.todoService = todoService;
    }

    //List Page
    @GetMapping("list-todos")
    public String viewList(Model model){

        return "listPage";
    }

    //Login Page
    @GetMapping("login")
    public String loginPage(){

        return "login";
    }

    //Login authentication
    @PostMapping("login")
    public String loginAuthentication(@RequestParam String userName, @RequestParam String password, Model model){
        if (authenticationService.authentication(userName, password)){
            model.addAttribute("name",userName);

            return "welcome";
        }
        model.addAttribute("errMessage","Please Check userName or password");
        return "login";
    }

    @GetMapping("list-Page")
    public String showListPage(Model model ,@ModelAttribute("name") String name){
        List<Todo> list = todoService.findByName(name);
        model.addAttribute("todos",list);

        return "listPage";
    }

}
