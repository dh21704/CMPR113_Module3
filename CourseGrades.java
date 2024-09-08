/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmpr113_hw3;


public class CourseGrades {
    GradedActivity grades[] = new GradedActivity[4];
    
    void setLab(GradedActivity obj)
    {
        grades[0] = obj;
    }
    
    void setPassFailExam(PassFailExam obj)
    {
        grades[1] = obj;
    }
    
    void setEssay(GradedActivity obj)
    {
        grades[2] = obj;
    }
    
    void setFinalExam(FinalExam obj)
    {
        grades[3] = obj;
    }
    
    public String toString()
    {
        return "\nLab Activity: " + grades[0] + 
                "\nPass/Fail Exam: " + grades[1] + 
                "\nEssay: " + grades[2] + 
                "\nFinal Exam: " + grades[3] + "\n";
    }

}
