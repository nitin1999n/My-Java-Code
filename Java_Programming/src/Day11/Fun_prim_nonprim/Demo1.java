package Day11.Fun_prim_nonprim;

public class Demo1 {
	int x=10;
	int y=20;
	
	void disp() {
		System.out.println("running disp() in Demo1");
	}
}

class sample1{
	Demo1 test() {
		System.out.println("running test() method");
		Demo1 ref1=new Demo1();
		return ref1;
	}
}
