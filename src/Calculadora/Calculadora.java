package Calculadora;

import java.util.Scanner;

public class Calculadora {

    // metodos de operacao

    double somar (double a, double b) {
        return a + b;
    }

    double subtrair (double a, double b) {
        return a - b;
    }

    double multiplicar (double a, double b) {
        return a * b;
    }

    double dividir (double a, double b) {
        if ( b == 0) {
            System.out.println("ERRO: divisao por zero!");
            return 0;
        } return a /b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        boolean continuar = true;

        System.out.println("=== Bem vindo a Calculadora da Maria Hyde! ===");

        while (continuar) {
            System.out.println("Digite o primeiro número: ");
            double num1 = entrada.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = entrada.nextDouble();

            // menu de opçoes
            System.out.println("\nEscolha a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = entrada.nextInt();
            double resultado;

            // executar operacoes
            switch (opcao) {
                case 1:
                    resultado = calc.somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calc.subtrair(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calc.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = calc.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 0:
                    System.out.println("Saindo da calculadora... ate mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }
        entrada.close();
}
}