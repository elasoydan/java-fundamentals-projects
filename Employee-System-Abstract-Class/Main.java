package elos;

public class Main {
	public static void main(String[] args) {
		
		FullTimeEmployee ftEmployee = new FullTimeEmployee("Ayse Yilmaz", "FT001", 25000.00, 5000.00);
		
		ftEmployee.calculateSalary();
		ftEmployee.displayEmployeeDetails();
		
		double newSalary = ftEmployee.calculateSalary(20);
		ftEmployee.calculateTax(newSalary);
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee("Burak Kaya", "PT002", 0.0, 150.00, 100);
		
		ptEmployee.calculateSalary();
		ptEmployee.displayEmployeeDetails();
		ptEmployee.calculateTax(ptEmployee.getSalary());
		} 
	}

