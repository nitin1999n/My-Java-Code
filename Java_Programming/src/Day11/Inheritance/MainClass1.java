package Day11.Inheritance;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
		Employee s1=new Employee();
		Person d1=s1.test("Nitin", 23, "M", 1001, 20000, "Employee");
		student s2=new student();
		Person d2=s2.disp("Suraj", 22, "M", 1002, 24, "RKGIT");
		System.out.println(d1.age);
		System.out.println(d1.gender);
		System.out.println(d1.name);
		System.out.println("ended");
	}

}
