package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;


    public double NetSalary(){ 
        
        return grossSalary - tax;

    }

    public void IncreaseSalary(double Percentage) { 

        grossSalary = ((grossSalary * Percentage) / 100) + grossSalary;
        
    }

    public String toString(){

        return name
        + ", $ "
        + String.format("%.2f", NetSalary());

    }
    
}