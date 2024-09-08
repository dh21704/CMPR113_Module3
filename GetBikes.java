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
public class GetBikes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter the gear of the bike: ");
        int num1 = scan.nextInt();
        
        System.out.print("\nEnter the speed of the bike: ");
        int num2 =scan.nextInt();
        
        System.out.print("\nEnter the height of the bike: ");
        int num3 = scan.nextInt();
        
        MountainBike mb = new MountainBike(num1, num2, num3);
        System.out.println(mb.toString());
    }
}
