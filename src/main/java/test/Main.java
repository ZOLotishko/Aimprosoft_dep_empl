package test;

import test.dao.DaoFactory;
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
        DepartmentDAO departmentDAO = DaoFactory.getDepartmentDAO();

        System.out.println(departmentDAO.readDepartments());
    }
}
