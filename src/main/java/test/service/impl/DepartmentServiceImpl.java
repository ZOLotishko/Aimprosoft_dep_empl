package test.service.impl;

import test.dao.DepartmentDAO;
import test.dao.Impl.DepartmentDAOImpl;
import test.entity.Department;
import test.service.DepartmentService;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    public List<Department> findAll() {
        return departmentDAO.readDepartments();
    }
}
