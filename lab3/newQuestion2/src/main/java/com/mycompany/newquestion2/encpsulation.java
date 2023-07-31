
package com.mycompany.newquestion2;

/**
 *
 * @author ravindu
 */
public class encpsulation {
    private String name;
    private int age;
    private float salary;
    
    public encpsulation(String name, int age, float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
}
