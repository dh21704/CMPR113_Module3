/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cmpr113_hw3;

public class Project1 {
    public static void main(String[] args) {
        CourseGrades bob = new CourseGrades();
        
        GradedActivity labActivity = new GradedActivity();
        
        PassFailExam passOrFail = new PassFailExam();
        
        GradedActivity essay = new GradedActivity();
        
        FinalExam exam = new FinalExam();
        
        labActivity.setScore(7);
        
        passOrFail.setScore(8);
        
        essay.setScore(9);
        
        exam.setScore(10);
        
        bob.setLab(labActivity);
        
        bob.setPassFailExam(passOrFail);
        
        bob.setEssay(essay);
        
        bob.setFinalExam(exam);
        
        System.out.println(bob);
     
    }
}
