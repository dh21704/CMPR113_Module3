/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmpr113_hw3;

/**
 *
 * @author danielhernandez
 */
public class GradedActivity {
    double score;
    
    public GradedActivity()
    {
        score = 0.0;
    }
    
    public void setScore(double score)
    {
        this.score = score;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public GradedActivity(double score)
    {     
        this.score = score;
    }
    
    public String toString()
    {
        return " " + score;
    }
            
}
