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
        System.out.print("\nEnter the Address: ");
        e.Address=scan.nextLine();
        
        System.out.print("\nEnter the City: ");
        e.City = scan.nextLine();
        
        System.out.print("\nEnter the State: ");
        e.State = scan.nextLine();
        
        System.out.print("\nEnter the Zip: ");
        e.Zipcode = scan.nextLine();
        
//        System.out.print("\nEnter the Employee Name: ");
//        e.EmployeeName=scan.nextLine();
       
        
        
        
        
       
        
//        System.out.print("\nEnter the Age: ");
//        e.age = scan.nextInt();
        
                //consuming
        scan.nextLine();
        
//        System.out.print("Enter the manager id: ");
//        m.ManagerID = scan.nextLine();
//        
//        System.out.print("\nEnter the manager name");
//        m.ManagerName = scan.nextLine();
       
        
        System.out.println("\n\n");
        System.out.println("The Employee Name: " + e.EmployeeName);
        
        System.out.println("Salary $" + e.salary);
        
        System.out.println("Bonus $" + e.bonus);
        
        System.out.println("The address is " + e.Address + ", " + e.City + ", " + e.State + " " + e.Zipcode);
        
        System.out.println("The grand salary is $" + e.totalSalary);
        
//        System.out.println("Address: " + e.Address);
//        System.out.println("City :" + e.City);
//        System.out.println("State " + e.State);
//        System.out.println("Zip " + e.Zipcode);
//        
//        System.out.println("Age: " + e.age);
//        
//        System.out.println("The Total Salary $" + (e.salary+bonus));
//        
//        System.out.println("Manager id " + m.ManagerID);
//        System.out.println("Manager Name " + m.ManagerName);
    }
//    private String Address;
//    private String City;
//    private String State;
//    private String Zipcode;
//    private int age;
//    private String EmployeeName;
//    private String salary = "100000";
}
