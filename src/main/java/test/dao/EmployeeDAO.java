package test.dao;

import test.entity.Employee;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public interface EmployeeDAO {

    @test.dao.support.Connection
    Employee readEmployeeByID(Integer id );

    @test.dao.support.Connection
    List<Employee> readEmployees();

    @test.dao.support.Connection
    void createEmployee(Employee employee);

    @test.dao.support.Connection
    void updateEmployee(Employee employee);

    @test.dao.support.Connection
    void deleteEmployee(Integer id);

    @test.dao.support.Connection
    List<Employee> readEmployeeByIDDepartment(Integer id);
}
