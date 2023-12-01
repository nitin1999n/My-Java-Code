package Day9.ConstructorCalling;

public class Demo1 {
	Demo1(){
		System.out.println("running Demo1 class constructor");
	}
}
class Demo2 extends Demo1{
	Demo2(){
		System.out.println("running Demo2 class constructor");
	}
}
class Demo3 extends Demo2{
	Demo3(){
		System.out.println("running Demo3 class constructor");
	}
}