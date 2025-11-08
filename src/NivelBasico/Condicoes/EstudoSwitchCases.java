package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    /*
    * Switch Cases - Que alternam entre casos específicos
    * Objectivo: Pedir para o usuário escolher um dos ninjas
    */


    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha entre um desses ninjas");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchira");
        System.out.println("3 - Sakura Haruno");
        System.out.print("> ");

        int opcaoDoNinjaSelecionado = caixaDeTexto.nextInt();

        switch (opcaoDoNinjaSelecionado) {
            case 1:
                System.out.println("Você selecionou o Naturo Uzumaki");
                break;
            case 2:
                System.out.println("Você selecionou o Sasuke Uchira");
                break;
            case 3:
                System.out.println("Você selecionou a Sakura Haruno");
                break;
            default:
                System.out.println("Opção não encontrada");
                break;
        }

        caixaDeTexto.close();

    }
}
