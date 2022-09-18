package Association;

public class Test {
    public static void main(String[] args) {
        University university=new University("MDU");

        Professor p1=new Professor(111,"Raman");
        Professor p2=new Professor(112,"Naman");
        Professor p3=new Professor(113,"Seema");

        university.dept.get(0).addProfessor(p1);
        university.dept.get(1).addProfessor(p2);
        university.dept.get(2).addProfessor(p3);

        System.out.println(university.name);
        for(Department d:university.dept)
        {
            System.out.println(d.did+" "+d.depName);
            for(Professor p:d.professors)
            {
                System.out.println(p.pid+p.name);
            }
            System.out.println();
        }
    }
}
