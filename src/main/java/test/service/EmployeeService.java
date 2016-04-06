package test.service;

import test.entity.Employee;

import java.util.List;

/**
 * Created on 05.04.16.
 */
public interface EmployeeService {

    void create(Employee employee);
    Employee read(Integer id);
    void update(Employee employee);
    void delete(Integer id);
    List<Employee> getAll();
    List<Employee> getAllEmployeesInDepartment(Integer id);

}
