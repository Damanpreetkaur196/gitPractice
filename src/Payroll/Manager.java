package Payroll;

import Payroll.Employee;
import java.util.Scanner;

/**
 * A Manager is an Employee. This class shows 
 * the inheritance relationship discussed in class
 *
 */
public class Manager extends Employee 
{
	private double bonus;//the amount of bonus they should receive
	
        
        public Manager(String name, double hours, double wage)
        {
            super(name);
            this.setHourlyWage(wage);
            this.setHours(hours);
            //System.out.println("Please enter a bonus for the manager");
            //Scanner sc = new Scanner(System.in);
            //double givenBonus = sc.nextDouble();
            //bonus = givenBonus;
        }
	/**
	 * A constructor that sets the bonus to zero
	 * @param newName
	 */
	public Manager(String newName) {
		super(newName);
		bonus =0;
	}
	
	/**
	 * Accessors and mutators for bonus
	 */
	public void setBonus (double bonusAmount)
	{
		bonus = bonusAmount;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	/**
	 * A method that calculates the pay for a manager,
	 * Note that this is overriden from the base class.
	 */
	public double calculatePay()
	{
		return getWage() * getHours() + bonus;
	}
	
	
        
        /**
         * A method to print the manager's statement to the console
         */
//        public String printStatement()
//        {
//            
//        String a = " Manager:" + getName() + " is owed: ";
//        String b =" $" + calculatePay() ;
//        String c = "**************************************************************";
//        return a+b+c;
//        }
}
