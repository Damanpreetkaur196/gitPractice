
package Payroll;
/**
 * A class that models the Payroll Application.
 * We are modeling this as an Object so we must think of
 * what would represent both the state and the behaviour of 
 * the PayRoll class. 
 */
import Payroll.PartTimeEmployee;
import Payroll.Manager;
import Payroll.Employee;
import java.util.Scanner;

//****************************************************************************************************************
//In the below class we are using factory pattern by creating a new class called EmployeeVal which hides the details of how the
//instances of the employee class(common base class) are created
//****************************************************************************************************************88
public class Payroll
{
 private Employee employees[] = new Employee[100];//the array to hold Employee Objects
 
 /**
  * A main method where we create an instance of the payroll
  * and then call the private run method on it.
  * We also catch our Exceptions here from the Employee
  * class.
  */
 public static void main (String[] args)
 {
    
      
   try
   {
     Payroll japp = new Payroll();
     japp.run();
   }
   catch (NumberFormatException e)
   {
     System.out.println("A number format is incorrect " + e.getMessage() + " Please ensure hours and wage are entered as numbers and not words");
   }
   catch(Exception e)
   {
     System.out.println("An exception was caught while trying to process employees: " + e.getMessage()); 
   }
  }//end main method
 /**
  * A private run method that prompts the user for input and
  * adds each Employee to the array.
  * Finally, we call the print method to print out the payroll
  * for each employee and the total.
  */
private void run()
{
  Scanner sc= new Scanner(System.in);
  boolean shouldContinue= true;//to keep track of whether the user wants to continue
  System.out.println("Welcome to the Payroll Application.");
  int numEmployees=0;
  while (shouldContinue)
  {
    System.out.println("Please enter the Employee's name: " );
    String name = sc.nextLine();
    System.out.println("Pleae enter the Employee's number of hours worked as a number: ");
    int numHours = Integer.parseInt(sc.nextLine());
    System.out.println("Please enter the Employee's hourly wage: " );
    double wage = Double.parseDouble(sc.nextLine());
    System.out.println("Do you want to create a manager? Type yes or no");
    String manager = sc.nextLine();
    
    double bonus = 0;
    
    if(manager.equals("yes"))
    {
        System.out.println("Please enter a bonus for the manager");
        bonus = sc.nextDouble();
//        Manager man = new Manager(name, numHours, wage);
//        man.setBonus(bonus);
//        employees[numEmployees]=man;
    }
//    else
//    {
//        System.out.println("Do you want to create a part-time Employee?");
//        String partTime = sc.nextLine();
//        if(partTime.equals("yes"))
//        {
//            PartTimeEmployee emp = new PartTimeEmployee(name, numHours,wage);//create a new Employee with the given info
//            employees[numEmployees]= emp;//add the new employee to the array
//        }
        employees[numEmployees] = EmployeeVal.createEmployee(name, numHours, wage, manager.equals("yes"), bonus);
            numEmployees++;
//    }
    
    System.out.println("Would you like to enter another employee (yes or no)?");
    String yesOrNo =sc.nextLine();
    shouldContinue = yesOrNo.equalsIgnoreCase("yes");
    
//    numEmployees++;
  }//done entering Employees, now print out the pay for each employee, and then the pay for all
  
  double totalPaid=0;

         PrintStatement p=new PrintStatement();
         CalculatePay cp=new CalculatePay();
   //   for (int i=0; i<numEmployees; i++)
 // {
  //   Object e = employees[i];
//     if(e instanceof Employee)
//     {
//         Employee emp =employees[i];
//         p.printStatement(emp, cp);
//        //note that this will not work correctly with Managers!
//        totalPaid+=cp.calculatePay(emp);
//     }
//     else if (e instanceof PartTimeEmployee)
//     {
//         PartTimeEmployee emp =(PartTimeEmployee)employees[i];
//         //emp.printStatement();
//        //note that this will not work correctly with Managers!
//        totalPaid+=emp.calculatePay();
//     }
//    
//   Employee emp =(Employee)employees[i];
//   System.out.println(p.printStatement(emp, cp));
//   //note that this will not work with Managers!
//   totalPaid+=cp.calculatePay(emp);
//  }
//  System.out.println("The total amount to be paid to all employees is "  );
//  System.out.printf("%s%.2f\n", " $", totalPaid);
//}
for (int i = 0; i < numEmployees; i++) {
        Employee emp = employees[i];
        String statement = p.printStatement(emp, cp);
        System.out.println(statement);
        totalPaid += cp.calculatePay(emp);
    }

    System.out.println("The total amount to be paid to all employees is ");
    System.out.printf("%s%.2f\n", " $", totalPaid);
}

}
  


 