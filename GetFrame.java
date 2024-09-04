
package com.mycompany.classexercise3;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;



public class GetFrame extends JFrame{
    
    JLabel lblScore1, lblScore2, lblScore3;
    JTextField txtScore1, txtScore2, txtScore3;
    JButton btnGetScore, btnClear;
    
    
    
    public GetFrame()
    {
        JPanel panel = new JPanel();
        
        lblScore1 = new JLabel("Score 1");
        
        lblScore2 = new JLabel("Score 2");

        lblScore3 = new JLabel("Score 3");
        
        //7 is the width
        txtScore1 = new JTextField(7);
        
        txtScore2 = new JTextField(7);
        
        txtScore3 = new JTextField(7);

        btnGetScore = new JButton("Get Grade");
        btnClear = new JButton("Clear Grades");
        
        panel.add(lblScore1);
        panel.add(txtScore1);
        
        panel.add(lblScore2);
        panel.add(txtScore2);
        
        panel.add(lblScore3);
        panel.add(txtScore3);

        panel.add(btnGetScore);
        panel.add(btnClear);
        
        add(panel);
        
        
        btnGetScore.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            // Get text from text fields
            String Score1 = txtScore1.getText();
            String Score2 = txtScore2.getText();
            String Score3 = txtScore3.getText();

            // Convert the string to double
            double score1 = Double.parseDouble(Score1);
            double score2 = Double.parseDouble(Score2);
            double score3 = Double.parseDouble(Score3);

            // Create a Grades object
            Grades var = new Grades();
            
            // Set the scores in the Grades object
            var.setSum(score1, score2, score3);

            // Show the grade and average
            JOptionPane.showMessageDialog(null, "Grade: " + var.getGrade() + "\nAverage: " + var.getAverage());
            
            var.TransferData();

        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid number
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for the scores.");
        }
    }
});
        
        btnClear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txtScore1.setText(null);
                txtScore2.setText(null);
                txtScore3.setText(null);

            }
        }
        );

        
    }
    
    
    public static void main(String[] args) {
        JFrame frame = new GetFrame();
        frame.setTitle("Test Scores");
        
        //packs all the tools of the object?
        //sets everything together
        frame.pack();
        
        frame.setVisible(true);
        
        
    }
}
