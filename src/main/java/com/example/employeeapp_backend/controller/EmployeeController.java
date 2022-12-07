package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;



//    @GetMapping("/")
//    public String EmployeeWelcomePage()
//    {
//        return "Welcome to my website";
//    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Employee> SearchEmployee(@RequestBody Employee e) {
        String empcode = String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.SearchEmployee(e.getEmpcode());

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddEmployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpname().toString());
        dao.save(e);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> view()
    {
        return (List<Employee>) dao.findAll();
    }





}
