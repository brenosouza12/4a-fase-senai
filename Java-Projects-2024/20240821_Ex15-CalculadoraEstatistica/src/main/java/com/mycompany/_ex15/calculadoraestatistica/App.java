/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ex15.calculadoraestatistica;
import java.util.Scanner;

/**
 *
 * @author breno_h_souza
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números a serem inseridos: ");
        int qntNumeros = scanner.nextInt();
        
        int somaTotal = 0, somaPares = 0, somaImpares =  0;
        
        for(int i = 1; i <= qntNumeros; i++ ){
            
            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            somaTotal += numero;
            
            if(numero % 2 == 0){
                
                somaPares += numero;
            
            }else{
                
                somaImpares += numero;
            
            }
        
        }
        
        System.out.println("A soma total dos números é: " + somaTotal);
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números ímpares é: " + somaImpares);
        
    }
}
