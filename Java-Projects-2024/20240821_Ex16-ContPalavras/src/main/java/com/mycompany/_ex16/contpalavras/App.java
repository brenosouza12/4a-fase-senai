/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex16.contpalavras;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");
        
        int numeroDePalavras = palavras.length;

        System.out.println("A frase tem " + numeroDePalavras + " palavras.");

        scanner.close();
    }
}