package test.dao;

import test.entity.Employee;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public interface EmployeeDAO {

    Employee readEmployeeByID(int id );
    List<Employee> readEmployees();
    void createEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    List<Employee> readEmployeeByIDDepartment(int id);
}
