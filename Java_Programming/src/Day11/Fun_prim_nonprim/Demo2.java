package Day11.Fun_prim_nonprim;

public class Demo2 {
	
	int x=10;
	int y=20;
	void disp() {	
	}
}
class sample2{
	Demo2 test() {
		System.out.println("running test() method");
		Demo2 ref1= new Demo2();
		ref1.x=100;
		ref1.y=200;
		return ref1;
	}
}
