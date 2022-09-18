import java.util.ArrayList;

class Student
{
    //instance variables
    private int id;
    private String name;
    int marks;
    //static variable
    static final int maxMarks=500;
    static int count=0;
    //static block
    static
    {
        System.out.println("Student class is loading...");
    }
    //instance block
    {
        count++;
    }
    //contructor
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    //getters
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    //setters
    void setId(int id)
    {
        this.id=id;
    }
    void setName(String name)
    {
        this.name=name;
    }

    void updateMarks(int marks)
    {
        this.marks=marks;
    }
    void displayMarks()
    {
        System.out.println("Marks: "+marks);
    }
    void displayPercentage()
    {
        double p=(double)marks/maxMarks*100;
        System.out.println("Percentage : "+p+"%");
    }
}

class Test
{
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
       s.add(new Student(1,"priya"));
        s.add(new Student(2,"akshita"));
        s.add(new Student(3,"Naman"));

        s.get(0).updateMarks(496);
        s.get(1).updateMarks(390);
        s.get(2).updateMarks(450);

        System.out.println("Total Students: "+Student.count);
        for(Student st:s)
        {
            System.out.println(st.getId());
            System.out.println(st.getName());
            st.displayPercentage();
        }

    }
}