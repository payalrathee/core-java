package sorting;
import java.util.*;
import utilities.Student;

public class ComparableSorting {
	public static void main(String... args)
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("a");
		a.add("dhd");
		a.add("djd");
		Collections.sort(a);
		System.out.println(a);
		
		ArrayList<Double> d=new ArrayList<Double>();
		d.add(12.27);
		d.add(373.393);
		d.add(393.3393);
		Collections.sort(d);
		System.out.println(d);
		
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(1,"anu"));
		s.add(new Student(2,"priya"));
		s.add(new Student(3,"aisha"));
		Collections.sort(s);
		System.out.println(s);
	}

}
