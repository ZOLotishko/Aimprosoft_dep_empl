package test;

import test.dao.DepartmentDAO;
import test.dao.impl.DepartmentDAOImpl;
import test.dao.impl.EmployeeDAOImpl;
import test.entity.Department;
import test.entity.Employee;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 04.04.16.
 */
public class Main {
    public static void main(String[] args ) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Date date = new Date("90/08/12");
        Employee employee = new Employee("Anna", "annadfbh@mail.com", 11000, date,2);

//        employeeDAO.createEmployee(employee);

        System.out.print(employeeDAO.readEmployees());

    }
}
