package test.service.impl;

import test.dao.EmployeeDAO;
import test.dao.impl.EmployeeDAOImpl;
import test.entity.Employee;
import test.service.EmployeeService;

import java.util.List;

/**
 * Created on 05.04.16.
 */
public class EmployeeServiceImpl  implements EmployeeService{

    EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    @Override
    public void create(Employee employee) {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee read(int id) {
        return employeeDAO.readEmployeeByID(id);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    public void delete(int id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDAO.readEmployees();
    }

    @Override
    public List<Employee> getAllEmployeesInDepartment(int id) {
        return employeeDAO.readEmployeeByIDDepartment(id);
    }
}
