package test.service.impl;

import test.dao.DepartmentDAO;
import test.dao.impl.DepartmentDAOImpl;
import test.entity.Department;
import test.service.DepartmentService;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    @Override
    public void create(Department department) {

        departmentDAO.createDepartment(department);

    }

    @Override
    public Department read(int id) {
        return departmentDAO.readDepartmentByID(id);
    }

    @Override
    public void update(Department department) {
        departmentDAO.updateDepartment(department);

    }

    @Override
    public void delete(int id) {
        departmentDAO.deleteDepartment(id);

    }

    @Override
    public List<Department> getAll() {
        return departmentDAO.readDepartments();
    }
}
