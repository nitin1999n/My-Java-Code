package Day11.Fun_prim_nonprim;

public class Demo3 {
	
	int x;
	int y;
	Demo3(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class sample3{
	Demo3 test() {
		System.out.println("running test method");
		Demo3 ref1=new Demo3(100,200);
		return ref1;
	}
}
