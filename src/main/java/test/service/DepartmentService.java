package test.service;

import test.entity.Department;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public interface DepartmentService {

    void create(Department department);
    Department read(Integer id);
    void update(Department department);
    void delete(Integer id);
    List<Department> getAll();
}
