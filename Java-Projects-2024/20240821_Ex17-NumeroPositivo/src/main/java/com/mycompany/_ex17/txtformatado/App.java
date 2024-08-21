/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex17.txtformatado;

/**
 *
 * @author breno_h_souza
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
   
            String hexadecimal = Integer.toHexString(numero);
            
            String octal = Integer.toOctalString(numero);

            char caractere = (char) numero;

            System.out.println("O número " + numero + " em:");
            System.out.println("- Decimal: " + numero);
            System.out.println("- Hexadecimal: " + hexadecimal);
            System.out.println("- Octal: " + octal);
            System.out.println("- Caractere: " + caractere);
        } else {
            System.out.println("Erro: O número deve ser positivo.");
        }

        scanner.close();
    }
}