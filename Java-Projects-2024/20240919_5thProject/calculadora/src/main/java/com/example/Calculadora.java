package com.example;

public class Calculadora {

    private int resultado = 0;

    // Método para somar dois números
    public double somar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }

    // Método para subtrair dois números
    public double subtrair(int n1, int n2) {
        resultado = n1 - n2;
        return resultado;
    }

    // Método para multiplicar dois números
    public double multiplicar(int n1, int n2) {
        resultado = n1 * n2;
        return resultado;
    }

    // Método para dividir dois números, com verificação para divisor zero
    public double dividir(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        resultado = n1 / n2;
        return resultado;
    }

    // Método para verificar se um número é par
    public boolean isPar(int n) {
        return n % 2 == 0;
    }

    // Método para verificar se um número é divisível por outro
    public boolean isDivisivel(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return n1 % n2 == 0;
    }

    // Método para resolver equação de 1º grau (ax + b = 0)
    public double resolverEquacaoPrimeiroGrau(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("Coeficiente 'a' não pode ser zero");
        }
        return -b / a;
    }

    // Método para resolver equação de 2º grau (ax² + bx + c = 0)
    public double[] resolverEquacaoSegundoGrau(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coeficiente 'a' não pode ser zero");
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new IllegalArgumentException("A equação não possui raízes reais");
        }
        double[] raizes = new double[2];
        raizes[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raizes[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return raizes;
    }
}
