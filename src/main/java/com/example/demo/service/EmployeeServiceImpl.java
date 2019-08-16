package com.example.demo.service;
import java.util.*;

import com.example.demo.model.CustomEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> getItEmployees(){
        return employeeRepository.findByDname("IT");
    }

    public List<Employee> getSalesEmployees() {return employeeRepository.findByDname("Sales");}

    public List<Employee> getAdminEmployees() {return employeeRepository.findByDname("Administration");}

    public List<Employee> getMarketingEmployees() {return employeeRepository.findByDname("Marketing");}

    public List<Employee> getHREmployees() {return employeeRepository.findByDname("Human Resources");}

    public List<Employee> getShippingEmployees() {return employeeRepository.findByDname("Shipping");}

    public List<Employee> getFinanceEmployees() {return employeeRepository.findByDname("Finance");}

    public List <CustomEmployee>   gettest() {return employeeRepository.getUserEntityFullNameByDname("IT");}

}
