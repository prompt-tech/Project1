package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String goHome(){
        return "index";
    }

    @RequestMapping(path="/employee", method = RequestMethod.GET)
    public String goEmployee() {return "employee";}

    @RequestMapping(path="/department", method=RequestMethod.GET)
    public String goDepartment() { return "department";}

    @RequestMapping(path="/deptpage", method = RequestMethod.GET)
    public String goDept() {return "deptpage";}

    @RequestMapping(path="/ITDept", method = RequestMethod.GET)
    public String ITDept() {return "ITDept";}

    @RequestMapping(path="/SalesDept", method = RequestMethod.GET)
    public String SalesDept() {return "SalesDept";}

    @RequestMapping(path="/AdminDept", method = RequestMethod.GET)
    public String AdminDept() {return "AdminDept";}

    @RequestMapping(path="/MarketingDept", method = RequestMethod.GET)
    public String MarketingDept() {return "MarketingDept";}

    @RequestMapping(path="/HRDept", method = RequestMethod.GET)
    public String HRDept() {return "HRDept";}

    @RequestMapping(path="/ShippingDept", method = RequestMethod.GET)
    public String ShippingDept() {return "ShippingDept";}

    @RequestMapping(path="/FinanceDept", method = RequestMethod.GET)
    public String FinanceDept() {return "FinanceDept";}
}