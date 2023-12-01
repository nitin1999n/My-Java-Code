package OOPs.Encapsulation;

public class main {

	public static void main(String[] args) {
		Car car =new Car("Honda","Verna",2023);
		
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

	}

}
