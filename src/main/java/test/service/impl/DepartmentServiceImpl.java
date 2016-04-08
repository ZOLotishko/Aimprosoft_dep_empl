package test.service.impl;

import test.dao.DaoFactory;
import test.dao.DepartmentDAO;
import test.entity.Department;
import test.exeption.ValidationException;
import test.service.DepartmentService;
import test.validation.MyValidation;

import java.util.List;
import java.util.Map;

/**
 * Created on 04.04.16.
 */
public class DepartmentServiceImpl implements DepartmentService{

    private MyValidation myValidation = new MyValidation();

    private DepartmentDAO departmentDAO = DaoFactory.getDepartmentDAO();

    @Override
    public void create(Department department) throws ValidationException {

        myValidation.valid(department);
        departmentDAO.createDepartment(department);

    }



    @Override
    public Department read(Integer id) {
        return departmentDAO.readDepartmentByID(id);
    }

    @Override
    public void update(Department department) throws ValidationException {
        myValidation.valid(department);
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
