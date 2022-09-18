package Association;

import java.util.ArrayList;

public class Department {
    int did;
    String depName;
    ArrayList<Professor> professors=new ArrayList<>();

    Department(int id,String name)
    {
        this.did=id;
        this.depName=name;
    }
    void addProfessor(Professor p)
    {
        professors.add(p);
    }

}
