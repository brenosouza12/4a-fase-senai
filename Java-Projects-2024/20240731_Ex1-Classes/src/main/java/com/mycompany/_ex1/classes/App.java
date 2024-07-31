/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex1.classes;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        
        Student s =  new Student("Rosanna Sparkle",38,"122377", "Dev de Sistemas");
        s.getName();
        s.getAge();
        s.getEnrollment();
        s.getCourse();
        
        System.out.println("This student name is: " + s.getName());
        System.out.println("This student age is: " + s.getAge());
        System.out.println("This student enrollment is: " + s.getEnrollment());
        System.out.println("This student course is: " + s.getCourse());
        
    }
    
}
