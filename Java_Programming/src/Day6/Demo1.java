package Day6;

public interface Demo1 {
	int x=100; // by default static final and public 
	void test();//by default abstract and public
}
class Sample1 implements Demo1{
	public void test() {
		System.out.println("test() method implemented in sample class");
	}
}
