package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //to tell Spring that this class is controller
@RequestMapping("/employee") //start endpoint for all of our controller methods
public class EmployeeController {

    @GetMapping("/register") //employee registration endPoint
    public String createEmployee() {

        return "employee/employee-create";
    }


}
