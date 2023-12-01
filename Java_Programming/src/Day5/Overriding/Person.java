package Day5.Overriding;

public class Person {
	int age;
	String name;
	char gender;
	
	Person(String name, int age, char gender){
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	void details() {
		System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender);
	}
}
