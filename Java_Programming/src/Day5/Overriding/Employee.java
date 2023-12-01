package Day5.Overriding;

public class Employee extends Person {
	int id;
	double salary;
	double exp;
	
	Employee(String name, int age, char gender, int id, double salary, double exp){
		super(name, age, gender);
		this.id=id;
		this.salary=salary;
		this.exp=exp;
	}
	void details() {
		System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+ " ID: "+id+" Salary: "+salary+" Experience: "+exp+"Years");
	}
}
