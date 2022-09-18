package arrayLists;
import java.util.*;
import utilities.*;

public class ArrayLists {

	public static void main(String[] args) {
		//arraylists without generics and autoboxing
		ArrayList a=new ArrayList();
		a.add(Integer.valueOf(19));
		a.add("payal");
		a.add(new Student(1,"Harry"));
		a.add(new Employee(101,"Bob"));
		
		ArrayList b=new ArrayList();
		b.addAll(a);
		b.add('f');
		
		System.out.println(a);
		System.out.println(b);
		
		for(Object o:a)
		{
			if(o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.roll+" "+s.name);
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
