package GerenciadorTarefas;

import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Objeto objeto = new Objeto();
        int escolher;

        do {
            System.out.println("""
                    !- MENU -!
                    1 - Criar
                    2 - Editar 
                    3 - Listar
                    4 - Excluir
                    0 - Sair
    
                    """);
            System.out.println("Escolha:");
            escolher = teclado.nextInt();
            teclado.nextLine();

            switch (escolher) {
                case 1 -> objeto.adicionar(teclado);
                case 2 -> objeto.editar(teclado);
                case 3 -> objeto.listar();
                case 4 -> objeto.excluir();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Tente novamente. Opção inválida!!");
            }

        } while (escolher != 0);
    }
    }

