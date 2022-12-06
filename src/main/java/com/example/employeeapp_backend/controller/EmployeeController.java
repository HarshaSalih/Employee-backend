package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String Employeewelcomepage()
    {
        return "Welcome to my website";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Addemployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpname().toString());
        return "Employee added successfully";
    }



}
