package Demoprograms;

public class Student extends Person{
	double grade;
	
	public Student(String name, int age, double grade) {

		super(name, age);
	}
	
	public String toString()
	{
		return "Student[super=" + super.toString() + ",grade=" + grade + "]";
		
	}
}
