
public class EmployeeTester 

{

	public static void main(String args[])
	
	{
		Employee pete = new Employee("Rigas, Pete", 550000);
		
		System.out.println("Employee's name is " + pete.getName());
		System.out.println("Expected output: Rigas, Pete ");
		System.out.println("Employee's salary is " + pete.getSalary());
		System.out.println("Expected output: 550000.0");
		pete.raiseSalary(10);
		System.out.println("Employee's new salary is " + pete.getSalary());
		System.out.println("Employee's new salary is 605000.0");
		
		
	}
	
}
