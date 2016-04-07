package test.service.impl;

import test.dao.DaoFactory;
import test.dao.DepartmentDAO;
import test.dao.impl.DepartmentDAOImpl;
import test.entity.Department;
import test.service.DepartmentService;
import test.validate.DepartmentValidate;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDAO departmentDAO = DaoFactory.getDepartmentDAO();

    @Override
    public void create(Department department) {
        departmentDAO.createDepartment(department);
    }

    @Override
    public Department read(Integer id) {
        return departmentDAO.readDepartmentByID(id);
    }

    @Override
    public void update(Department department) {
        departmentDAO.updateDepartment(department);

    }

    @Override
    public void delete(Integer id) {
        departmentDAO.deleteDepartment(id);

    }

    @Override
    public List<Department> getAll() {
        return departmentDAO.readDepartments();
    }
}
