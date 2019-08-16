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
    public List<Employee> getAllEmployees() { return employeeRepository.findAll(); }

    public List <CustomEmployee> getITEmployees() {return employeeRepository.getUserEntityFullNameByDname("IT");}

    public List<CustomEmployee> getSalesEmployees() {return employeeRepository.getUserEntityFullNameByDname("Sales");}

    public List<Employee> getAdminEmployees() {return employeeRepository.findByDname("Administration");}

    public List<CustomEmployee> getMarketingEmployees() {return employeeRepository.getUserEntityFullNameByDname("Marketing");}

    public List<CustomEmployee> getHREmployees() {return employeeRepository.getUserEntityFullNameByDname("Human Resources");}

    public List<CustomEmployee> getShippingEmployees() {return employeeRepository.getUserEntityFullNameByDname("Shipping");}

    public List<CustomEmployee> getFinanceEmployees() {return employeeRepository.getUserEntityFullNameByDname("Finance");}
}
