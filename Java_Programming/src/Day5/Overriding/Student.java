package Day5.Overriding;

public class Student extends Person {
	int rollno;
	double marks;
	String collegename;
	
	public Student(String name, int age, char gender, int rollno, double marks, String collegename) {
		super(name, age, gender);
		this.rollno=rollno;
		this.marks=marks;
		this.collegename=collegename;
		}
	void details() {
		System.out.println("Name: "+name+", Age: "+age+", Gender: "+gender+ ", Roll no: "+rollno+", Marks: "+marks+", Collegename: "+collegename);
	}
	}
