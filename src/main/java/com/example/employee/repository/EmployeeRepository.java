// Write your code here
package com.example.employee.repository;

import java.util.ArrayList;

import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);
    
    Employee addEmployee(Employee employeeId);
    
    Employee updateEmployee(int employeeId, Employee employee);
    
    void deleteEmployee(int employeeId);

}