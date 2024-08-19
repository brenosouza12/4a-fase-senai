/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex10.medtemperatura;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double CelsiusTemperature, fahrenheitTemperature;
        
        System.out.println("Digite a temperatura em Celsius: ");
        CelsiusTemperature = scanner.nextDouble();
        
        fahrenheitTemperature = (CelsiusTemperature * 9/5) + 32;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheitTemperature);
        
        scanner.close();
        
    }
}
