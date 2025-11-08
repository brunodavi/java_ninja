package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    /*
    * Scanner - É um jeito de trazer o usuário para dentro da aplicação
    * Objetivo: O usuário vai criar um ninja e vamos validar os dados
    */

    public static void main(String[] args) {
        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja");
        System.out.print("> ");

        // Armazenar a proxima linha que o usuário digitar
        String nomeDoNinja = caixaDeTexto.nextLine();

        System.out.println("Digite a idade do ninja");
        System.out.print("> ");

        // Armazenar a proxima linha que for um número do usuário
        int idadeDoNinja = caixaDeTexto.nextInt();

        // Fechar Scanner
        caixaDeTexto.close();

        System.out.println("O nome do ninja informado é: " + nomeDoNinja);
        System.out.println("E sua idade é: " + idadeDoNinja);

        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é adulto");
        } else {
            System.out.println("Esse ninja ainda é muito novo");
        }

    }
}
