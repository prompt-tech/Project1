package com.example.demo.service;
import java.util.List;
import java.util.Map;

import com.example.demo.model.CustomEmployee;
import com.example.demo.model.Employee;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public List <CustomEmployee> getITEmployees();
    public List<CustomEmployee> getSalesEmployees();
    public List<Employee> getAdminEmployees();
    public List<CustomEmployee> getMarketingEmployees();
    public List<CustomEmployee> getHREmployees();
    public List<CustomEmployee> getShippingEmployees();
    public List<CustomEmployee> getFinanceEmployees();
}
