/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise3;

/**
 *
 * @author danielhernandez
 */
class Questionz extends Grades{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public Questionz(int q, int m)
    {
        double numericScore;
        numQuestions = q;
        numMissed = m;
        
        pointsEach = 100.0/q;
        numericScore = 100.0 - (m * pointsEach);
        
        setScore(numericScore);   
        
    }
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    public double getNumMissed()
    {
        return numMissed;
    }
    
    
    
}
