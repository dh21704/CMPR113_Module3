/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class Project2 extends JFrame{
    public double score;
    public double sum = 0;
    public double average = 0;
    public void setScore(double s)
    {
        score = s;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public double getSum(double s)
    {
        sum += s;
        return sum;
    }
    
    public double getAverage()
    {
        average = sum/5;
        return average;
    }
    
    public char getGrade()
    {
        char letterGrade = ' ';
        
        if (score >= 90)  
        {
            letterGrade = 'A';
        }
        else if (score >= 80)
        {
            letterGrade = 'B';
        }
        else if (score >= 80)
        {
            letterGrade = 'B';
        }
        else if (score >= 70)
        {
            letterGrade = 'C';
        }
        else if (score >= 60)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }
    return letterGrade;
    
    }
    
    public static void main(String[] args) {
        System.out.println("jklsadfafklds");
        
        JFrame frame = new JFrame("Enter 5 numbers separated by text");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); //set null layout for absolute positioning
        
        JTextField textInput = new JTextField(7);
        
        textInput.setBounds(30, 20, 200, 50);
        
        frame.add(textInput);
        
        JButton btnOK = new JButton("Go");
        btnOK.setBounds(50, 70, 200, 30);
        frame.add(btnOK);
        
        btnOK.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double sum = 0;
                double average = 0;
                double FinalScore = 0;
                String input = textInput.getText();
                
                Project2 var = new Project2();
                
                StringTokenizer st = new StringTokenizer(input, " ");
                try
                {
                    while (st.hasMoreTokens())
                    {
                        String temp = st.nextToken();
                        FinalScore = Double.parseDouble(temp);
                        var.getSum(FinalScore);
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "only space between numbers: ");
                }
                JOptionPane.showMessageDialog(null, "Your average Grade is " + var.getAverage());
            }
            
        }
        
        
        );
        
        
        
        frame.setVisible(true);
        
        
    }
}
