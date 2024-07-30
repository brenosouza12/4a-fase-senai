/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stproject_20240729;

import java.util.ArrayList;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("Start");
        
        Task tl = new Task("Wake Up", "Open Eyes");
        
        tl.complete();
        
       //  System.out.println(tl);
       
       ArrayList<Task> tasks =  new ArrayList<Task>();
       tasks.add(tl);
       tasks.add(new Task ("Up down", "Take a Shower"));
       System.out.println(tasks);
    }
}
