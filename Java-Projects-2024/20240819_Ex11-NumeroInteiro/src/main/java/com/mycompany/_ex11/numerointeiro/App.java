/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex11.numerointeiro;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = Integer.parseInt(scanner.nextLine());
        
        String par = numero % 2 == 0 ? "par" : "ímpar";
        String pos = numero >= 0 ? "positivo" : "negativo";
        
        System.out.println("O número " + numero + " é " + par + " e " + pos);
        
        scanner.close();
        
    }
}

