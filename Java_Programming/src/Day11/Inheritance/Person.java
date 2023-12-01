package Day11.Inheritance;

public class Person {
	String name;
	int age;
	String gender;
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}
class Employee{
	int id;
	double salary;
	String designation;
	Person test(String name,int age,String gender,int id, double salary,String designation) {
		System.out.println("running test()------");
		Person ref1=new Person(name, age, gender);
		return ref1;
	}
}
class student{
	int rollno;
	double marks;
	String collegeName;
	Person disp(String name,int age,String gender,int rollno,double marks, String collegeName){
		System.out.println("running disp()--------");
		Person ref2=new Person(name, age, gender);
		return ref2;
	}
}
