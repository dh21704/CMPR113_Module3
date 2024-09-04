/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

import java.io.*;
import javax.swing.JOptionPane;


public class Grades {
    
    //only this class can see it
    private double score;
    
    double score1, score2;
    
    double sum, avg;
    
    //mutators and accessor methods using inheritance
    
    //mutator methods
    public void setScore(double s)
    {
        score = s;
    }
    
    public void setSum(double s1, double s2, double s3)
    {
//        String input;
//        
//        input = JOptionPane.showInputDialog("Enter 1st num");
//        s1 = Double.parseDouble(input);
//        
//        input = JOptionPane.showInputDialog("Enter 2nd num");
//        s2 = Double.parseDouble(input);
//        
//        input = JOptionPane.showInputDialog("Enter 3rd num");
//        s3 = Double.parseDouble(input);
        
        sum = s1 + s2 + s3;
        
        avg = Math.round(sum / 3);
    }
    
    //accessor method
    public double getSum()
    {
        return sum;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public char getGrade()
    {
        char letterGrade;
        
        if (avg >= 90)
        {
            letterGrade = 'A';
        }
        else if (avg >= 80)
        {
            letterGrade = 'B';
        }
        else if (avg >= 70)
        {
            letterGrade = 'C';
        }
        else if (avg >= 60)
        {
            letterGrade = 'D';
        }
        else 
        {
            letterGrade = 'F';
        }
        
        return letterGrade;
        
    }
    
    public double getAverage()
    {
        return avg;
    }
    
    public void TransferData()
    {
        
        try  
        {
            File f = new File("Grade.txt");
        
        //appends
        FileWriter fw = new FileWriter(f, true);
        
        
        fw.write("\n");
        fw.write("Grade " + 
                getGrade() + "\n" +
                "avg " + getAverage());
        fw.write("\n");

        
        fw.close();
        
        JOptionPane.showMessageDialog(null, "Grades Recorded");
        
        }
        catch(Exception ex)         
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
}
