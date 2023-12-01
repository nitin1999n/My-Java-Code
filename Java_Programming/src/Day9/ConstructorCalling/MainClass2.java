package Day9.ConstructorCalling;

public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main started");
		
		Demo4 d1=new Demo4();
		System.out.println("----------------");
		Demo5 d2=new Demo5(3);
		System.out.println("----------------");
		Demo6 d3=new Demo6(7);
		
		System.out.println("Main method Ended");

	}

}
