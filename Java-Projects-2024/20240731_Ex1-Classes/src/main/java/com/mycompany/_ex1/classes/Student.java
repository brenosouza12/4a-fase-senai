/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ex1.classes;

/**
 *
 * @author breno_h_souza
 */
public class Student extends People {
    
    private String enrollment;
    private String course;
    
    public Student(String name, int age, String enrollment, String course){
               
        super(name,age);
        this.enrollment = enrollment;
        this.course = course;
    
    }
    
      public void setEnrollment(String enrollment){
        
        this.enrollment = enrollment;
    
    }
    
    public String getEnrollment(){
        
        return enrollment;
    
    }
    
       public void setCourse(String course){
        
        this.course = course;
    
    }
    
    public String getCourse(){
        
        return course;
    
    }
    
}
