package elos;

public abstract class Employee implements IPayment {

    private String name;
    private String employeeID;
    protected double salary;

    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void calculateSalary();
    public abstract void displayEmployeeDetails();

    @Override
    public double calculateTax(double salary) {

        double taxRate;

        if (salary < 30000) {
            taxRate = 0.10;
        } else {
            taxRate = 0.20;
        }

        double taxAmount = salary * taxRate;

        this.salary = salary - taxAmount;

        System.out.println("Tax Rate: %" + (int)(taxRate * 100));
        System.out.println("Deduction Amount: " + taxAmount + " TL");
        System.out.println("Remaining Salary: " + this.salary + " TL");

        return this.salary;
    }
}
