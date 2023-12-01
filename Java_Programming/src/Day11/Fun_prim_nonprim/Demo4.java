package Day11.Fun_prim_nonprim;

public class Demo4 {
	
	int x;
	int y;
	Demo4(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class sample4{
	Demo4 test(int x,int y) {
		System.out.println("running test()");
		Demo4 ref1=new Demo4(x,y);
		return ref1;
	}
}