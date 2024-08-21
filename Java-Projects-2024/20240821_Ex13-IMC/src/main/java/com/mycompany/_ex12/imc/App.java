/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex12.imc;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        // Classificação do IMC (opcional, pode ser adicionada)
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        scanner.close();
    }
}