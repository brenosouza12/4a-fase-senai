import java.util.Scanner;

public class Calculadora {

    public void adicionarNumeros(){

        float x = 0, y = 0, res = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = x + y;
            System.out.println("O resultado da soma é: " + res);
            
          scanner.close();


    }

    public float subtrairNumeros(float a,float b){

        return (a - b);
        
    }

    public float multiplicarNumeros(float a,float b){

        return (a * b);
        
    }

    public float dividirNumeros(float a,float b){

        float divisao = 0;

        try {

            divisao = a / b;

        } catch (Exception e) {

            System.out.println("Valor Invalido");

        } finally {

            System.out.println("Programa encerrado");

        }

         return divisao;

    
    }

    public float calcularResto(float a,float b){

        return (a % b);
        
    }

    public int calcularFatorial(int n){

        int f = 1;


    for(int i = 1; i <= n; i ++){


         f = f * 1;

    }

        return (f);
        
    }

    public void contaPalavras(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String [] palavras = frase.trim().split("\\s+");

        int numeroDePalavras = palavras.length;

        System.out.println("Numero de palavras na frase: " + numeroDePalavras);

        scanner.close();

    }

    public void converterNumero(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {

            System.out.println("Erro: O número deve ser positivo.");
            
        }else {

            System.out.println("Valor em decimal: " + numero);
            System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero));
            System.out.println("Valor em octal: " + Integer.toOctalString(numero));
            System.out.println("Valor convertido em caractere: " + (char) numero);

        }

        scanner.close();

    }



}
