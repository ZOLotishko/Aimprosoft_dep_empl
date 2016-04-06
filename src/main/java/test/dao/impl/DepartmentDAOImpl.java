package test.dao.impl;

import test.dao.DepartmentDAO;
import test.entity.Department;
import test.util.MYSQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 04.04.16.
 */
public class DepartmentDAOImpl implements DepartmentDAO {
    public Department readDepartmentByID(Integer id) {

        Connection connection = MYSQLConnection.getConnection();
        String sql = "SELECT id, name FROM department WHERE id = ?";
        ResultSet resultSet ;
        Department department = new Department();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                department.setId(resultSet.getInt("id"));
                department.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return department;
    }

    public List<Department> readDepartments() {
        Connection connection = MYSQLConnection.getCurrentConnection();
        String sql = "SELECT id, name FROM department ";
        List<Department> departments = new ArrayList<>();
        ResultSet resultSet;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null){
                while (resultSet.next()) {

                    Department department = new Department();
                    department.setId(resultSet.getInt("id"));
                    department.setName(resultSet.getString("name"));
                    departments.add(department);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

    public void createDepartment(Department department) {

        Connection connection = MYSQLConnection.getConnection();
        String sql = "INSERT into department ( name) VALUES (?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, department.getName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDepartment(Department department) {

        Connection connection = MYSQLConnection.getConnection();
        String sql = "UPDATE department SET name = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, department.getName());
            preparedStatement.setInt(2, department.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDepartment(Integer id) {

        Connection connection = MYSQLConnection.getConnection();
        String sql ="DELETE FROM department WHERE id = ? ";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Department checkName( String name)  {
        Connection connection = MYSQLConnection.getConnection();
        Department department = new Department();

        String sql = "SELECT * FROM departments WHERE name = ? ";
        ResultSet resultSet ;
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                department.setId(resultSet.getInt("id"));
                department.setName(resultSet.getString("name"));
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }
}
