/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stproject_20240729;

/**
 *
 * @author breno_h_souza
 */
public class Task {
        
       private String title;
       private String description;
       private boolean complete;
       
       public Task (String title, String description){
           
           this.title = title;
           this.description = description;
           this.complete = false;
       }
       
       public void complete(){
            
           this.complete = true;
       
       }
             
          @Override
          
          public String toString() {
    
          if (complete){
        
            return " [x] " + this.title;
    
          }
    
           return " [] " + this.title;
    
          }
    }

