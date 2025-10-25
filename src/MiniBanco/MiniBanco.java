package MiniBanco;

import java.util.Scanner;

public class MiniBanco {
    String titular;
    int numeroConta;
    double saldo;


    MiniBanco(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if ( valor > 0 ) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("========= BEM VINDO AO BANCO QUERO TUDO O QUE VOCÊ TEM!");
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("A sua conta é: ");
        int numeroConta = entrada.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = entrada.nextDouble();

        MiniBanco conta = new MiniBanco(nome, numeroConta, saldoInicial);
        System.out.println("Conta criada com sucesso! Titular: " + conta.titular + ", Saldo: R$" + conta.saldo);


        System.out.println("===== MENU DE OPÇÕES: ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Sair");
        int escolhaUsuario = entrada.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("Digite o valor do deposito: ");
            double valorDeposito = entrada.nextDouble();
            conta.depositar(valorDeposito);
        } else {
            System.out.println("Saindo... Obrigado por usar nosso banco!");
        }

        entrada.close();
    }
}