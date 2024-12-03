/**
 * 
 */
package Payroll;

/**
 * A class that represents Employee Objects.
 * Employees have a name, a number of hours
 * and an hourlyWage.
 * 
 */

 //*************************************************************
//I made a class for calculating pay and printStatement method. Deleted the method so that this class will follow first solid principle of single responsibility.
//now this class is only setting and getting arguments 

//******************************************************
public class Employee 
{

	private String name;
	private double numHours;
	private double hourlyWage;
	
	/**
	 * Our no-arg constructor for safety in
	 * inheritance.
	 */
	public Employee()
	{
		
	}
        
        public Employee(String givenName, double givenWage, double givenHours)
        {
            name = givenName;
            hourlyWage = givenWage;
            numHours = givenHours;
        }
	/**
	 * A constructor tht takes in the Employee's name
	 * @param newName
	 */
	public Employee(String newName)
	{
		setName(newName);
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setHours(double hoursWorked)
	{
		numHours=hoursWorked;
	}
	
	public double getHours()
	{
		return numHours;
	}
	
	public void setWage(double workingWage)
	{
		hourlyWage=workingWage;
	}
	
	public double getWage()
	{
		return hourlyWage;
	}
	
	/**
	 * A method to return the pay due to this employee
	 * @return the total pay
	 */
//	public double calculatePay()
//	{
//		return numHours * hourlyWage;
//	}
////	
	
	/**
	 * Our overriden toString method, from Object
	 */
	public String toString()
	{
		return "This employee's name is: " + getName();
	}
	
	/**
	 * An overriden equals method for Employees
	 */
	public boolean equals(Object other)
	{
		if ((this.getName().equals (((Employee)other).getName())))
			return true;
		return false;
	}

	public double getNumHours() {
		return numHours;
	}

	public void setNumHours(double numHours) {
		this.numHours = numHours;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
        
        /**
 * A private print method that takes in an Employee and calls the getPayment method on it.
 * It then uses printf to format the output in a professional way.
 * @param emp an Employee Object.
 */
        
  //*************************************************************
//I made a class for calculating pay and printStatement method. Deleted the method so that this class will follow first solid principle of single responsibility.
//now this class is only setting and getting arguments 

//******************************************************
//public String printStatement()
//{
//  
//  String a =" Employee:" + getName() + " is owed: ";
//  String b = " $"+ calculatePay() ;
//  String c ="**************************************************************";
//  return a+b+c;
//}
	
}



