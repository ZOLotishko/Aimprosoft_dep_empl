package test.controller.dep;

import test.controller.InternalController;
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

    private DepartmentServiceImpl departmentService = new DepartmentServiceImpl();

    @Override
    public void executor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Department department = new Department();
        String id = request.getParameter("id");
        department.setName(request.getParameter("name"));

        if(id.isEmpty()){
            departmentService.create(department);

        }else {
            department.setId(Integer.parseInt(id));
            departmentService.update(department);
        }
        response.sendRedirect("/");
    }
}
