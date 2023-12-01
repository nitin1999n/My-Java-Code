package Day9.ConstructorCalling;

public class Demo4 {

	public Demo4() {
		System.out.println("Running Demo4 class constructor");
	}
}
class Demo5 extends Demo4{
	Demo5(int arg){
		System.out.println("Running Demo5 Class");
		System.out.println("arg value " +arg);
	}
}
class Demo6 extends Demo5{
	Demo6(int arg){
		super(arg);
		System.out.println("Running Demo6 class ");
	}
}