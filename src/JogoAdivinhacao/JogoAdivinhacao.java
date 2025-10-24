package JogoAdivinhacao;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        //gerando o numero
        int randomNum = rand.nextInt(101);
        int palpite = -1;

        System.out.println("------ BEM VINDO AO JOGO DA ADIVINHAÇÃO ------");


        while (palpite != randomNum) {
            System.out.println("Digite o seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite == randomNum) {
                System.out.println("VOCÊ ACERTOU!!!!");
                break;
            } else if (palpite < randomNum) {
                    System.out.println("O número é maior!!");
                } else {
                    System.out.println("O número é menor");
                }

            }
        entrada.close();
        }

    }
