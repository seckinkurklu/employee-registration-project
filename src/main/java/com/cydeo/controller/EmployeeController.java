package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //@Component
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createemployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("statelist", DataGenerator.getAllStates());


        return "employee/employee-create";
    }


}