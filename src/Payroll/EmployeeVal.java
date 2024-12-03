/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payroll;

/**
 *
 * @author preet
 */
public class EmployeeVal {
    public static Employee createEmployee(String name, double numHours, double wage, boolean isManager, double bonus) {
        if (isManager) {
            Manager manager = new Manager(name, numHours, wage);
            manager.setBonus(bonus);
            return manager;
        } else {
            return new PartTimeEmployee(name, numHours, wage);
        }
    }
}
