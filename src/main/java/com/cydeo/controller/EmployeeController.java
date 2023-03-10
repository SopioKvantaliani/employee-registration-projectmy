package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //to tell Spring that this class is controller
@RequestMapping("/employee") //start endpoint for all of our controller methods
public class EmployeeController {

    @GetMapping("/register") //employee registration endPoint
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());


        return "employee/employee-create";

    }


}
