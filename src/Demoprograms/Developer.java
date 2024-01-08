package Demoprograms;

public class Developer extends Employee{
	private double bonus;
	private double salary
	;
	public Developer(double salary, double bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	public double calculateSalary() {
		return salary + bonus;
		
	}

}
