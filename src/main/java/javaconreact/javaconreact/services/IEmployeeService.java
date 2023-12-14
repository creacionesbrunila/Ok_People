package javaconreact.javaconreact.services;

import javaconreact.javaconreact.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee);
}
