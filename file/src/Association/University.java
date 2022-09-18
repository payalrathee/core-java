package Association;

import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Department> dept=new ArrayList<>();
    University(String name)
    {
        this.name=name;
        dept.add(new Department(101,"Commerce"));
        dept.add(new Department(102,"Science"));
        dept.add(new Department(103,"Law"));
    }
}
