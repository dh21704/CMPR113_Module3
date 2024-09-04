/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

import javax.swing.JOptionPane;

/**
 *
 * @author danielhernandez
 */
public class GetGrades extends Grades{
    public static void main(String[] args) {
        String input;
        double testScore;
        
        Grades var = new Grades();
        
        //input = JOptionPane.showInputDialog("Enter the score between 0-100");
        
        //testScore = Double.parseDouble(input);
        
        //var.setScore(testScore);
        
        var.setSum(0, 0, 0);
        
        
       
        
        //JOptionPane.showMessageDialog(null, "sum" + var.getSum());

        JOptionPane.showMessageDialog(null, "average" + var.getAverage());
        
         //null means cetner of screen
        JOptionPane.showMessageDialog(null, "grade" + var.getGrade());
        
    }
}
