
package com.mycompany.classexercise3;

import java.util.Scanner;


public class Vehicle {
    
    protected String brand;
    protected String modelName;
    protected String mileage;
    Scanner scan = new Scanner(System.in);

    
    
    public void TheCar()
    {
        System.out.println("Tner the brand of the car ");
        
        brand = scan.nextLine();
        
        System.out.println("Enter model of the car");
        
        modelName = scan.nextLine();
        
        System.out.println("");
        
    }
    
    public void TheMileage()
    {
        System.out.println("Enter the mielage ");
        mileage = scan.nextLine();
    }
    
}
