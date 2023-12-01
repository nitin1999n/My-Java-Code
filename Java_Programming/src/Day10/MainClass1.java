package Day10;

public class MainClass1 {
    public static void main(String[] args) {
        HR hrEmployee1 = new HR(1, "John", 50000.0);
        HR hrEmployee2 = new HR(2, "Raj", 30000.0);
        
        System.out.println("Employee Information Before Diwali:");
        hrEmployee1.displayInfo();
        
        hrEmployee1.increaseSalaryOnDiwali();
        
        System.out.println("Employee Information After Diwali:");
        hrEmployee1.displayInfo();
        System.out.println("-----------------------------------");
        
        System.out.println("Employee Information Before Diwali:");
        hrEmployee2.displayInfo();
        
        hrEmployee2.increaseSalaryOnDiwali();
        
        System.out.println("Employee Information After Diwali:");
        hrEmployee2.displayInfo();
    }
}