/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex14.tabuada;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num,res;
        
        System.out.println("===================");
        System.out.println("Tabuada do Breno");
        System.out.println("===================");
        System.out.println("Informe um numero: ");        
        
        num = number.nextInt();
        
        for(int i = 0;i <=10; i++){
            
            res =  num * i;
            System.out.println(num + " x " + i + " = " + res);
        
        }
    }
}
