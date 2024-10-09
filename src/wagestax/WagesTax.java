/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wagestax;

import java.util.Scanner;

/**
 *
 * @author kevinesteff
 */
public class WagesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //create a new object (employee)
        Employee emp = new Employee();
        System.out.print("Name: ");
        //input the employee name
        emp.name = sc.nextLine();
        
        //input the employee salary
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        
        //input salary tax of the employee
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        
        //result after tax
        System.out.println(emp);
        
        //input the percentage that will be increased according to the salary before tax
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        
        // output the result
        System.out.println("Updated data: " + emp);
    }
    
}
