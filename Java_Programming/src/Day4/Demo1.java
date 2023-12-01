package Day4;

public class Demo1 {
	void test() {
		int x =10;
		class sample1{
			int y =100;
			void disp() {
				System.out.println("Running disp method");
			}
		}
		sample1 s1= new sample1();
		System.out.println("y value is " +s1.y);
		s1.disp();
		System.out.println("x value is "+x);
	}
}
