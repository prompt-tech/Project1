package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @RequestMapping(path="/employee", method=RequestMethod.GET)
    public String goHome(){
        return "index";
    }

    @RequestMapping(path="/ViewEmployee", method=RequestMethod.GET)
    public String ViewEmployee(){
        return "ViewEmployee";
    }

}