package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RefreshScope
@RestController
public class EmployeeSearchController {

    @Autowired
    EmployeeSearchService employeeSearchService;

    @RequestMapping("/employee/find/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeSearchService.findById(id);
    }

    @RequestMapping("/employee/findAll")
    public Collection<Employee> findAll() {
        return employeeSearchService.findAll();
    }
}