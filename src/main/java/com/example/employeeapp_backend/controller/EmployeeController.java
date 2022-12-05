package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String Employeewelcomepage()
    {
        return "Welcome to my website";
    }

   @GetMapping("/add")
    public String Employeeaddpage()
    {
        return "Welcome to employee add page";
    }
}
