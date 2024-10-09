/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wagestax;

/**
 *
 * @author kevinesteff
 */
public class Employee {
    
    
    //attributes 
    public String name;
    public double grossSalary;
    public double tax;
    
    //method
    public double netSalary(){
        return grossSalary - tax;
    }
    //method
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }
    
    
    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", netSalary());
    }
    
}
