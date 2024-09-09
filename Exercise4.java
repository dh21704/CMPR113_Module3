/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author danielhernandez
 */




public class Exercise4 extends JFrame{
    private final JButton btnGetCar;
    
    public Exercise4()
    {
        JFrame firstFrame = new JFrame("First Frame");
        firstFrame.setSize(300, 400);
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setLayout(null);
        
        JTextField jt = new JTextField("Get your car");
        jt.setBounds(50, 20, 200, 30); // Position the text field

        
        btnGetCar = new JButton("Start");
        
        btnGetCar.setBounds(50, 50, 200, 30);
        
        firstFrame.add(jt);
        firstFrame.add(btnGetCar);
       
        
        btnGetCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog
                
                Car2 nc = new Car2();
                
                JOptionPane.showMessageDialog(firstFrame, nc.getMyCar2());

                // Close the first frame
                firstFrame.dispose();

                // Create and display the second frame
                JFrame secondFrame = new JFrame("Second Frame");
                secondFrame.setSize(300, 200);
                secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                secondFrame.setVisible(true);
            }
        });
                
                 firstFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
                javax.swing.SwingUtilities.invokeLater(() -> new Exercise4());
    }

    
}
