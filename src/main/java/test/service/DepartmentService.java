package test.service;

import test.entity.Department;

import java.util.List;

/**
 * Created on 04.04.16.
 */
public interface DepartmentService {

    void create(Department department);
    Department read(int id);
    void update(Department department);
    void delete(int id);
    List<Department> getAll();
}
