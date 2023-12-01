package Day7;

public class MethodOverloading {

	public static void add(int[] a) {
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void add(double [] a) {
		double sum=0;
		for(int i=0;i<a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		add(a1);
		double[] a2= {2,3,4,7,8};
		add(a2);
		
		
	}
}

