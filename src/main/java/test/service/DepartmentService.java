package test.service;

import test.entity.Department;
import test.exeption.ValidationException;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public interface DepartmentService {

    void create(Department department) throws ValidationException;
    Department read(Integer id);
    void update(Department department) throws ValidationException;
    void delete(Integer id);
    List<Department> getAll();
}
