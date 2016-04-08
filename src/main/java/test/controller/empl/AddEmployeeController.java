package test.controller.empl;

import test.controller.InternalController;
import test.entity.Employee;
import test.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Created on 06.04.16.
 */
public class AddEmployeeController implements InternalController {
    @Override
    public void executor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String d = request.getParameter("date");
        Date date = Date.valueOf(d);
//        Date date = Date.valueOf(request.getParameter("date"));
        Double salary = Double.parseDouble(request.getParameter("salary"));
        Integer dep_id = Integer.parseInt(request.getParameter("department_id"));
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Employee employee = new Employee(name, email, date, salary, dep_id);


        if (id.isEmpty()){
            employeeService.create(employee);
        }else{
            employee.setId(Integer.valueOf(id));
            employeeService.update(employee);
        }
        response.sendRedirect("/listEmployee?department_id=" + dep_id);
    }
}
