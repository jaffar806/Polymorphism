package polymeriphism;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("jaffar", "Software developer", 50000);
	
		Employee employee2 = new Employee("pathan", "java software engineer", 60000);
		
		System.out.println("\nEmployee Details:");
		employee1.printEmployeeDetails();
		System.out.println("\n");
		employee2.printEmployeeDetails();
		
		employee1.raiseSalary(10);
		employee2.raiseSalary(15);
		
		System.out.println("\nAfter raising 10% salary of Jaffr: ");
		employee1.printEmployeeDetails();
		System.out.println("\nAtter raising 15% salary of Pathan: ");
		employee2.printEmployeeDetails();
	}

}
