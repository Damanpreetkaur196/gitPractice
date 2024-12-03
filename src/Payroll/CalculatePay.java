/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payroll;

/**
 *
 * @author preet
 */
public class CalculatePay{
    public double calculatePay(Employee e)
	{
            if(e instanceof Manager)
            {
                Manager m=(Manager)e;
                return m.getHours()*m.getWage()+m.getBonus();
            }
		return e.getNumHours() * e.getHourlyWage();
	}
//	
}
    
