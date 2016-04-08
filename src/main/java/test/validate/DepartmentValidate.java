package test.validate;

import test.dao.impl.DepartmentDAOImpl;
import test.entity.Department;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 06.04.16.
 */
public class DepartmentValidate implements Validate {

    private Map<String, String> errors;
    private DepartmentDAOImpl departmentsDAO ;

    private String name;
    @Override
    public Map<String, String> getMessagesMap() {
        return errors;
    }

    @Override
    public void validate() {

        checkName(name);

    }


    public DepartmentValidate( Department department) {
        errors = new HashMap<>();
        departmentsDAO = new DepartmentDAOImpl();
        this.name = department.getName();
    }

    private void checkName( String name) {

        Department department = new Department();
        department = departmentsDAO.checkName( name);


        if (name.equals("")){
            errors.put("name", "Pls, Enter name department");
        }
        if (name.length() < 2){
            errors.put("name", "Name department so short");
        }
        if (name.length() > 25){
            errors.put("name", "Name department so long");
        }
        if (department.getId() != 0){
            errors.put("name", "Name Exist");
        }
    }
}
