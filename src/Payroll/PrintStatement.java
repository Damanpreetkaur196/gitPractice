/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payroll;
//**********************************************************************************
    //In this class we have created a method for printing statement for any type of employee whether manager or part time due to which we do 
    //not need to rewrite the code again and again. Thus, following DRY principle
    
//*************************************************************************************
    


/**
 *
 * @author preet
 */
public class PrintStatement {
    
    
    public String printStatement(Employee e, CalculatePay cp)
{
    String a;
    if(e instanceof Manager)
    {  
        a = " Manager:" + e.getName() + " is owed: ";
    } 
    else{
        a =" Employee:" + e.getName() + " is owed: ";
    }
    String b = " $"+ cp.calculatePay(e) ;
    String c ="**************************************************************";
    return a+b+c;

}   

  
  
    
       
}
