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

    @GetMapping("/search")
    public String Employeesearchpage()
    {
        return "Welcome to employee search page";
    }

    @GetMapping("/edit")
    public String Employeeeditpage()
    {
        return "Welcome to employee edit page";
    }

    @GetMapping("/view")
    public String Employeeviewpage()
    {
        return "Welcome to employee view page";
    }

    @GetMapping("/delete")
    public String Employeedeletepage()
    {
        return "Welcome to employee delete page";
    }
}
