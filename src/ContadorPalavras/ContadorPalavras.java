package ContadorPalavras;

import java.util.Scanner;

public class ContadorPalavras {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o seu texto ou frase: ");
    String texto = entrada.nextLine();

    // separar texto por espaços
    String[] palavras = texto.split(" ");
    int totalPalavras = palavras.length;

    String[] frases = texto.split("[!?,.;]");
    int totalFrases = frases.length;

    String letras = texto.replaceAll("[^a-zA-Z]", "");
    int totalLetras = letras.length();

    //mostra o total
    System.out.println("Total de palavras: " + totalPalavras);
    System.out.println("Total de frases: " + totalFrases);
    System.out.println("Total de letras: " + totalLetras);

}
}



