package test.dao;

import test.entity.Employee;

import java.util.List;

/**
 * Created by user on 04.04.16.
 */
public interface EmployeeDAO {

    public Employee readEmployeeByID(int id );
    public List<Employee> readEmployees();
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
}
