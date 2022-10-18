package utilities;

public class Student implements Comparable<Student>{
	public int roll;
	public String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(roll==s.roll)
			return 0;
		else if(roll<s.roll)
			return 1;
		else
			return -1;
	}
	
}
	

