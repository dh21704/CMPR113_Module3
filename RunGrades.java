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
public class RunGrades {
    public static void main(String[] args) {
        String input;
        double testScore;
        
        Grades var = new Grades();
        
        input = JOptionPane.showInputDialog("Enter a score between 0-100");
        testScore = Double.parseDouble(input);
        
        var.setScore(testScore);
        var.setSum(0, 0, 0);
        
        JOptionPane.showMessageDialog(null, "The grade is " + var.getGrade());
        JOptionPane.showMessageDialog(null, "The sum is " + var.getSum());
        
        int questions, missed;
        
        input = JOptionPane.showInputDialog("Enter # of questions on final");
        questions = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter # of questions missed");
        missed = Integer.parseInt(input);
        
        Questionz var1 = new Questionz(questions, missed);
        
        JOptionPane.showMessageDialog(null, "each questions counts " + var1.getPointsEach());
        JOptionPane.showMessageDialog(null, "the exam score is " + var1.getScore());
        JOptionPane.showMessageDialog(null, "the exam grade is  " + var1.getGrade());

    }
}
