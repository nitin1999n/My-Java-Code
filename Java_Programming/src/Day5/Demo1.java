package Day5;

public class Demo1 {
	
	void test() {
		System.out.println("running test() method defined" + "in super class");
	}
}

class Demo2 extends Demo1{
	void test() {
		System.out.println("running test() method defined in sub class");
	}
}