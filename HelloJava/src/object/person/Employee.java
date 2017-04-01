package object.person;

public class Employee extends Person {

    private double salary;

    public Employee(double salary, String name, int age, int sex) {
        super(name, age, sex);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}