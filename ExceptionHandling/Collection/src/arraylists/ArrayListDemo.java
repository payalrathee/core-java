package arraylists;

import utility.Employee;
import utility.Student;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(10.2);
        a.add("asd");
        a.add(null);
        a.add(10);
        a.add(null);
        a.add(new Student(1,"naman"));
        a.add(new Employee(101,"ashi"));

        System.out.println(a);

        for(Object o:a)
        {
            if(o instanceof Integer)
                System.out.println(o);
            else if(o instanceof Double)
                System.out.println(o);
            else if(o instanceof Student)
            {
                Student s=(Student)o;
                System.out.println(s.id+" "+s.name);
            }
            else if(o instanceof Employee)
            {
                Employee e=(Employee)o;
                System.out.println(e.id+" "+e.name);
            }
            else
                System.out.println(o);
        }
    }

}
