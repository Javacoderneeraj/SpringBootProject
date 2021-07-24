package Spring_Boot.SpringBootProject.service;

import Spring_Boot.SpringBootProject.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
   void saveEmployee(Employee employee);

    }

