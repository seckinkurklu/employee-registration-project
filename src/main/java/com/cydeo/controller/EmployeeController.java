package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //@Component
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createemployee(){
        return "employee/employee-create";
    }


}