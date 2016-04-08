package test.entity;

import net.sf.oval.constraint.CheckWith;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import test.util.CheckWithEntity;

/**
 * Created by user on 04.04.16.
 */
public class Department {

    private Integer id;

    @NotNull(message = "Error name = 0")
    @NotEmpty(message = " Error")
    @Length(max = 20, min = 2, message = "Error Length")
    @CheckWith(CheckWithEntity.class)
    private  String name;

    public Department(){
        super();
    }

    public Department( String name){

        this.name = name;
    }


    public Department(Integer id , String name){
        this.id = id;
        this.name = name;
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


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
