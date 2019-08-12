package com.example.demo.controller;
import java.util.List;
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
    public List<Employee> getItEmployees() {return employeeService.getItEmployees();}

    @RequestMapping(path = "employees/sales", method = RequestMethod.GET)
    public List<Employee> getSalesEmployees() {return employeeService.getSalesEmployees();}

    @RequestMapping(path="employees/admin", method = RequestMethod.GET)
    public List<Employee> getAdminEmployees() {return employeeService.getAdminEmployees();}

    @RequestMapping(path="employees/marketing", method = RequestMethod.GET)
    public List<Employee> getMarketingEmployees() {return employeeService.getAdminEmployees();}

    @RequestMapping(path="employees/HRDept", method = RequestMethod.GET)
    public List<Employee> getHREmployees() {return employeeService.getHREmployees();}

    @RequestMapping(path="employees/ShippingDept", method = RequestMethod.GET)
    public List<Employee> getShippingEmployees() {return employeeService.getShippingEmployees();}

    @RequestMapping(path="employees/FinanceDept", method = RequestMethod.GET)
    public List<Employee> getFinanceEmployees() {return employeeService.getFinanceEmployees();}

}
