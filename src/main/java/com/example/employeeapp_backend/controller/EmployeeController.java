package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;



    @GetMapping("/")
    public String EmployeeWelcomePage()
    {
        return "Welcome to my website";
    }

    @CrossOrigin(origins = "x")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpName().toString());
        dao.save(e);
        return "Employee added successfully";
    }

    @CrossOrigin(origins = "x")
    @GetMapping("/view")
    public List<Employee> view()
    {
        return (List<Employee>) dao.findAll();
    }





}
