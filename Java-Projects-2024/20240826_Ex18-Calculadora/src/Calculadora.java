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

        if (b!=0)

         divisao = a / b;

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

}
