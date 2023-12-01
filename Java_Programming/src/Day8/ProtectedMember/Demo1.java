package Day8.ProtectedMember;

public class Demo1 {
	int x=100;
}
class Demo2 extends Demo1{
	int x=200;
	void display() {
		int x=300;
		System.out.println("local variable"+x);
		System.out.println("local variable"+this.x);
		System.out.println("local variable"+super.x);
	}
}
