package test.service.impl;

import test.dao.DaoFactory;
import test.dao.EmployeeDAO;
import test.dao.impl.EmployeeDAOImpl;
import test.entity.Employee;
import test.service.EmployeeService;

import java.util.List;

/**
 * Created on 05.04.16.
 */
public class EmployeeServiceImpl  implements EmployeeService{

    private EmployeeDAO employeeDAO = DaoFactory.getEmployeeDAO();
    @Override
    public void create(Employee employee) {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee read(Integer id) {
        return employeeDAO.readEmployeeByID(id);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDAO.readEmployees();
    }

    @Override
    public List<Employee> getAllEmployeesInDepartment(Integer id) {
        return employeeDAO.readEmployeeByIDDepartment(id);
    }
}
