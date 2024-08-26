import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        System.out.println("1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Resto, 6 - Fatorial");
        System.out.println("Escolha a operacao: ");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        Calculadora calc = new Calculadora();
        float x = 0, y = 0, res = 0;
        int num = 0;

        switch(op){

            case 1: 

            System.out.println("Soma");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = calc.adicionarNumeros(x, y);
            System.out.println("O resultado da soma é: " + res);
            break;

            case 2:

            System.out.println("Subtracao");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = calc.subtrairNumeros(x, y);
            System.out.println("O resultado da subtracao é: " + res);
            break;

            case 3: 

            System.out.println("Multiplicacao");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = calc.multiplicarNumeros(x, y);
            System.out.println("O resultado da multiplicacao é: " + res);
            break;

            case 4: 

            System.out.println("Divisao");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = calc.dividirNumeros(x, y);
            System.out.println("O resultado da divisao é: " + res);
            break;

            case 5:

            System.out.println("Resto");
            System.out.println("Digite o primeiro número: ");
             x = scanner.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = scanner.nextFloat();
            res = calc.calcularResto(x, y);
            System.out.println("O resultado do resto é: " + res);
            break;

            case 6: 

            System.out.println("Fatorial");
            System.out.println("Digite o número: ");
            num = scanner.nextInt();
            res = calc.calcularFatorial(num);
            System.out.println("O resultado da fatorial é: " + res);
            break;

            default:

            System.out.println("Opcao invalida");
            break;



        }
        scanner.close();
    }
    
}
