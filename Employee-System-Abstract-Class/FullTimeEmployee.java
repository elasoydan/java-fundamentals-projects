package elos;

public class FullTimeEmployee extends Employee {

    private double benefits;

    public FullTimeEmployee(String name, String employeeID, double salary, double benefits) {
        super(name, employeeID, salary);
        this.benefits = benefits;
    }

    public double getBenefits() {
        return benefits;
    }

    @Override
    public void calculateSalary() {
        salary = salary + benefits;
    }

    public double calculateSalary(int overtimeHours) {

        double hourlyPay = salary / 160;
        double overtimePay = hourlyPay * overtimeHours;

        System.out.println("Overtime Pay For " + overtimeHours + " Hours: " + overtimePay + " TL");

        salary += overtimePay;

        return salary;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Full-Time Employee Details");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Benefits: " + benefits);
        System.out.println("Calculated Total Salary: " + salary + " TL");
    }
}
