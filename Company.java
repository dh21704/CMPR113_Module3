/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;
import java.util.Scanner;

/**
 *
 * @author danielhernandez
 */
public class Company extends Employee{
    
    //psvm then tab
    public static void main(String[] args) {
        int bonus = 10000;
        
        Company e = new Company();
        Manager m = new Manager();
        
        Scanner scan = new Scanner(System.in);
       
        //sout then tab
        System.out.println("enter the address: ");
        e.Address=scan.nextLine();
        
        System.out.println("Enter the city");
        e.City = scan.nextLine();
        
        System.out.println("Enter the State ");
        e.State = scan.nextLine();
        
        System.out.println("Enter the Zip ");
        e.Zipcode = scan.nextLine();
        
        System.out.println("enter the age: ");
        e.age = scan.nextInt();
        
                //consuming
        scan.nextLine();
        
        System.out.println("Enter the maager id: ");
        m.ManagerID = scan.nextLine();
        
        System.out.println("enter the manager name");
        m.ManagerName = scan.nextLine();
       
        
        System.out.println("\n\n");
        System.out.println("the employee name: " + e.EmployeeName);
        
        System.out.println(" salary $" + e.salary);
        
        System.out.println(" address: " + e.Address);
        System.out.println("city :" + e.City);
        System.out.println("state " + e.State);
        System.out.println("zip " + e.Zipcode);
        
        System.out.println("age: " + e.age);
        
        System.out.println("the total sal $" + (e.salary+bonus));
        
        System.out.println("Manager id " + m.ManagerID);
        System.out.println("Manager Name " + m.ManagerName);
    }
}
