package Day5.Overriding;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started \n");
		
		Person p1=new Person("Ramesh",25,'M');
		p1.details();
		
		System.out.println("-----------------------------------");
		Student st1=new Student("Rani", 15, 'F', 223 , 78.9, "JSPD");
		st1.details();
		
		System.out.println("-----------------------------------");
		Employee e1=new Employee("Arun", 26, 'M', 3234, 2500.00, 14);
		e1.details();
		
		System.out.println("\nmain method ended");
	}

}
