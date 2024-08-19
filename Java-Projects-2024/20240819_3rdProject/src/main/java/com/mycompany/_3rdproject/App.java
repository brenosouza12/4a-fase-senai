/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._3rdproject;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("What your name? : ");
        String name =  scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + name + " ! Welcome to Java ! ");
        
    }
}
