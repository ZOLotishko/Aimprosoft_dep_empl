package test.entity;

import java.util.Date;

/**
 * Created on 04.04.16.
 */
public class Employee {

    private Integer id;
    private String name;
    private String email;
    private Double salary;
    private Date date;
    private Integer department_id;

    public Employee(){
        super();
    }


    public Employee(String name, String email,Date date, double salary,  Integer department_id){
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.date = date;
        this.department_id = department_id;
    }

    public Employee(String name, String email,Date date, Double salary ) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                ", department_id=" + department_id +
                '}';
    }
}
