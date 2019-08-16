package com.example.demo.controller;
import java.util.List;
import java.util.Map;

import com.example.demo.model.CustomEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeRestfulController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(path="employees/it", method=RequestMethod.GET)
    public List<CustomEmployee> getITEmployees() {return employeeService.getITEmployees();}

    @RequestMapping(path = "employees/sales", method = RequestMethod.GET)
    public List<CustomEmployee> getSalesEmployees() {return employeeService.getSalesEmployees();}

    @RequestMapping(path="employees/admin", method = RequestMethod.GET)
    public List<Employee> getAdminEmployees() {return employeeService.getAdminEmployees();}

    @RequestMapping(path="employees/marketing", method = RequestMethod.GET)
    public List<CustomEmployee> getMarketingEmployees() {return employeeService.getMarketingEmployees();}

    @RequestMapping(path="employees/hr", method = RequestMethod.GET)
    public List<CustomEmployee> getHREmployees() {return employeeService.getHREmployees();}

    @RequestMapping(path="employees/shipping", method = RequestMethod.GET)
    public List<CustomEmployee> getShippingEmployees() {return employeeService.getShippingEmployees();}

    @RequestMapping(path="employees/finance", method = RequestMethod.GET)
    public List<CustomEmployee> getFinanceEmployees() {return employeeService.getFinanceEmployees();}
}