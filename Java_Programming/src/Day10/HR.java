package Day10;

public class HR extends Employee {
    public HR(int ID, String Name, double Salary) {
        super(ID, Name, Salary);   
    }
    public void increaseSalaryOnDiwali() {
        this.Salary = Salary+(Salary*20/100);
    } 
}