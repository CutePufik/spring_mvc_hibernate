package com.ideaProjects.spring_mvc_hibernate.dao;

import com.ideaProjects.spring_mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
