package test.controller;

import test.dao.impl.DepartmentDAOImpl;
import test.entity.Department;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created on 04.04.16.
 */
public class ShowAllDepartmnetsController implements InternalController{

    @Override
    public void executor(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException{
        DepartmentDAOImpl departmentService = new DepartmentDAOImpl();
        List<Department> dep = departmentService.readDepartments();
        request.setAttribute("dep", dep);
        request.getRequestDispatcher("/jsp/listDepartment.jsp").forward(request, response);
    }
}
