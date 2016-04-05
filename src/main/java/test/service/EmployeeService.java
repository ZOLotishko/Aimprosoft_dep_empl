package test.service;

import test.entity.Employee;

import java.util.List;

/**
 * Created on 05.04.16.
 */
public interface EmployeeService {

    void create(Employee employee);
    Employee read(int id);
    void update(Employee employee);
    void delete(int id);
    List<Employee> getAll();
    List<Employee> getAllEmployeesInDepartment(int id);

}
