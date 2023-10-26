package polymeriphism;

public class Employee {
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String name, String jobTitle, double salary){
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobTitle() {
		return jobTitle;
				
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary (double percentage) {
		salary = salary + salary +percentage /100;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Name: " +name);
		System.out.println("JobTitle: "+jobTitle);
		System.out.println("Salary: "+salary);
	}

}
