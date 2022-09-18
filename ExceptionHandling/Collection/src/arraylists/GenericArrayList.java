package arraylists;

import utility.Student;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        for(int i:a)
            System.out.print(i+" ");
        System.out.println();

        ArrayList<Student> a1=new ArrayList<>();
        a1.add(new Student(1,"a"));
        a1.add(new Student(2,"b"));
        a1.add(new Student(3,"c"));

        for(Student s:a1)
            System.out.println(s.id+" "+s.name);
    }
}
