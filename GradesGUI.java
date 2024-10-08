/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;

/**
 *
 * @author danielhernandez
 */
public class GradesGUI extends JFrame{
    double score;
    
    
    public static void main(String[] args) {
        
        JFrame frame = new GradesGUI();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    private final JLabel lblEnterTestScore;
    private final JTextField txtEnterTestScore;
    private final JButton btnGetTestScore;
    
    public GradesGUI()
    {
        JPanel panel = new JPanel();
        
        panel.setLayout(null);
        
        panel.setBackground(Color.ORANGE);
        
        panel.add(lblEnterTestScore = new JLabel ("Enter Test Score"));
        
        
        //                         70 pixels from left, 70 pixels from the top
        //                          100 pixels width and 40 pixels height of the object
        lblEnterTestScore.setBounds(70, 70, 100, 40);
        
        panel.add(txtEnterTestScore = new JTextField(7));
        txtEnterTestScore.setBounds(185, 75, 40, 40);
        
        panel.add(btnGetTestScore = new JButton("Get Score"));
        btnGetTestScore.setBounds(155, 155, 100, 50);
        
        add(panel);
        
        btnGetTestScore.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = txtEnterTestScore.getText();
                double testScore;
                
                testScore = Double.parseDouble(input);
                
                GradesGUI var = new GradesGUI();
                var.setScore(testScore);
                
                JOptionPane.showMessageDialog(null, "The grade is " + var.getGrade());
                
                txtEnterTestScore.setText(null);
                txtEnterTestScore.requestFocus();
                
                try
                {
                    File f = new File("D:\\Scores.txt");
                    FileWriter fw = new FileWriter(f, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("Letter Grade: " + var.getGrade());
                    bw.newLine();
                    bw.close();
                    
                    System.out.println("score written");
                    
                    
                } catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        }
        
        )
                ;
        
        
    }

    private void setScore(double testScore) {
        score = testScore;
    }

    private char getGrade() {
        char letterGrade = ' ';
        
        if (score >= 90)
        {
            letterGrade = 'A';
        }
        else if (score >= 80)
        {
            letterGrade = 'B';

        }
        else if (score >= 70)
        {
            letterGrade = 'B';

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
    
            
    
}
