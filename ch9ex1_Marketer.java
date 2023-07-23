// A class to represent marketer
public class Marketer extends Employee {
// overrides getSalary from Employee class
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
// new behavior of Marketer objects
    public void advertise() {
        System.out.println("Act now, while, supplies last!");
    }
}
