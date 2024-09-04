
package com.mycompany.classexercise3;

public class Car extends Vehicle{
    
    public static void main(String[] args) {
        
        
        Car myCar = new Car();
    
        //calling the method
        myCar.TheCar();
        
        System.out.println(
                "My car: " + myCar.brand +
                "\nModel Name: " + myCar.modelName
                + "\nMileage: " + myCar.mileage);   
        
        //see why the Insurance info cannot be showed from Modudle 2
        
    }
    
    
 }
    

