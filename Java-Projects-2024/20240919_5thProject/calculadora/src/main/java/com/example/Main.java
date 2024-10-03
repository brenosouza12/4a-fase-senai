package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int x, y;
        String sX, sY;

        // Entrada do primeiro número
        sX = JOptionPane.showInputDialog(null, "Type a first number:", "First Number", JOptionPane.QUESTION_MESSAGE);
        x = Integer.parseInt(sX);

        // Entrada do segundo número
        sY = JOptionPane.showInputDialog(null, "Type a second number:", "Second Number", JOptionPane.QUESTION_MESSAGE);
        y = Integer.parseInt(sY);

        Calculadora calc = new Calculadora();

        // Operações básicas
        JOptionPane.showMessageDialog(null, "Sum: " + calc.somar(x, y));
        JOptionPane.showMessageDialog(null, "Sub: " + calc.subtrair(x, y));
        JOptionPane.showMessageDialog(null, "Mult: " + calc.multiplicar(x, y));

        // Divisão com verificação de erro
        try {
            JOptionPane.showMessageDialog(null, "Div: " + calc.dividir(x, y));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Verificar se o primeiro número é par
        JOptionPane.showMessageDialog(null, x + " is " + (calc.isPar(x) ? "even" : "odd") + ".");

        // Verificar se o primeiro número é divisível pelo segundo
        try {
            JOptionPane.showMessageDialog(null,
                    x + " is " + (calc.isDivisivel(x, y) ? "divisible by " + y : "not divisible by " + y) + ".");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Resolver equação de 1º grau
        sX = JOptionPane.showInputDialog(null, "Type coefficient a for equation ax + b = 0:", "Coefficient a",
                JOptionPane.QUESTION_MESSAGE);
        double a = Double.parseDouble(sX);
        sY = JOptionPane.showInputDialog(null, "Type coefficient b for equation ax + b = 0:", "Coefficient b",
                JOptionPane.QUESTION_MESSAGE);
        double b = Double.parseDouble(sY);

        try {
            double resultado1Grau = calc.resolverEquacaoPrimeiroGrau(a, b);
            JOptionPane.showMessageDialog(null, "Root of the 1st degree equation: x = " + resultado1Grau);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Resolver equação de 2º grau
        sX = JOptionPane.showInputDialog(null, "Type coefficient a for equation ax^2 + bx + c = 0:", "Coefficient a",
                JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(sX);
        sY = JOptionPane.showInputDialog(null, "Type coefficient b for equation ax^2 + bx + c = 0:", "Coefficient b",
                JOptionPane.QUESTION_MESSAGE);
        double b2 = Double.parseDouble(sY);
        sY = JOptionPane.showInputDialog(null, "Type coefficient c for equation ax^2 + bx + c = 0:", "Coefficient c",
                JOptionPane.QUESTION_MESSAGE);
        double c = Double.parseDouble(sY);

        try {
            double[] raizes = calc.resolverEquacaoSegundoGrau(a, b2, c);
            JOptionPane.showMessageDialog(null,
                    "Roots of the 2nd degree equation: x1 = " + raizes[0] + ", x2 = " + raizes[1]);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }
}
