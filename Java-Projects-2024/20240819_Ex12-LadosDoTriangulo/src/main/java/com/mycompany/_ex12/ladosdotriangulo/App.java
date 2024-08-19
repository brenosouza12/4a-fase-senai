/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex12.ladosdotriangulo;

/**
 *
 * @author breno_h_souza
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro lado do triângulo:");
        double lado1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o tamanho do segundo lado do triângulo:");
        double lado2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o tamanho do terceiro lado do triângulo:");
        double lado3 = Double.parseDouble(scanner.nextLine());

        boolean eTriangulo = (lado1 + lado2 > lado3) && 
                             (lado1 + lado3 > lado2) && 
                             (lado2 + lado3 > lado1);

        if (eTriangulo) {
            System.out.println("É possível formar um triângulo com esses lados.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses lados.");
        }
        
        scanner.close();
    }
}
