package com.example.demo.repository;

import com.example.demo.model.CustomEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Map;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAll();

    List<Employee> findByDname(String dname);

    @Query("select distinct new com.example.demo.model.CustomEmployee(e.fname, e.lname) from Employee e where e.dname = :dname")
    List<CustomEmployee> getUserEntityFullNameByDname(@Param("dname") String dname);
}