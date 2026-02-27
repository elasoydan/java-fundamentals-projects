package elos;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, String employeeID, double salary, double hourlyRate, int hoursWorked) {
        super(name, employeeID, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void calculateSalary() {
        salary = hourlyRate * hoursWorked;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("\nPart-Time Employee Details");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Hourly Rate: " + hourlyRate + " TL");
        System.out.println("Total Hours Worked: " + hoursWorked + " hours");
        System.out.println("Calculated Total Salary: " + salary + " TL");
    }
}
