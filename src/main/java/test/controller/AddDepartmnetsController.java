package test.controller;

import test.entity.Department;
import test.service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created on 05.04.16.
 */
public class AddDepartmnetsController implements InternalController {
    @Override
    public void executor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        Department department = new Department(id, name);
        departmentService.create(department);
        response.sendRedirect("/");
    }
}
