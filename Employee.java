
	

 

 public class Employee
 
 {
 

 /**
 
  Creates a class called Employee.
 
  */
  
  private String name;
  private double salary;
 

 
 
  public Employee(String employeeName, double currentSalary) //Constructs an object called Employee.
   {
 
	  name = employeeName;
 
	  salary = currentSalary;
 
 
  }
 
 
 public String getName() //Returns the string employeeName.
 {
  
	 return name;
  
 }
 
 
 
  public double getSalary() //Returns the salary of the employee.
  
  {
  
	  return salary;
  
  
  }
 
 public void raiseSalary(double byPercent) //Raises a salary by a certain percent.
 {
  
  
  salary = (1+(byPercent/100))*salary;
  
  
  
//  salary*=(1+(byPercent/100)); -->This is an alternate way to calculate the increase.
   
 
 }
 
 
 
 
 
 
 
}