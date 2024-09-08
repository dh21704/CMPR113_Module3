/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

class Bicycle {
    public int gear;
    public int speed;
    
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    
    public void speedUp(int increment)
    {
        speed += increment;
    }
    
   public String toString()
   {
       return ("The gears are " + gear + "\nThe speed of the bicycle is: " + speed);
   }
}
