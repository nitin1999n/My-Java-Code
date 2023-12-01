package Day10;

public class Employee {
    int ID;
    String Name;
     double Salary;
     
    public Employee(int ID, String Name, double Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
    }
    
    public void displayInfo() {
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Salary: " + Salary);
    }
}



