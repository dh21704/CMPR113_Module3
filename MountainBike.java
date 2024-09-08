/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

/**
 *
 * @author danielhernandez
 */
class MountainBike extends Bicycle{
    public int seatHeight;
    
    public MountainBike(int gear, int speed, int seatHeight)
    {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    
    public String toString()
    {
        return (super.toString() + "\nSeat height is: " + seatHeight);
    }
}
