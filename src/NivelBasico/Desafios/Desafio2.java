package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Versão 2
        int vagasDeNinjas = 3;
        String[] ninja = new String[vagasDeNinjas];

        int quantidadeDeNinjasCadastrados = 0;
        int opcao = 0;

        Scanner caixaDeTexto = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = caixaDeTexto.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidadeDeNinjasCadastrados == vagasDeNinjas) {
                        System.out.println("Vagas de ninjas estão lotadas");
                        break;
                    }

                    System.out.print("Nome do Ninja: ");
                    for (int i = 0; i < vagasDeNinjas; i++) {
                        if (ninja[i] == null) {
                            ninja[i] = caixaDeTexto.next();
                            quantidadeDeNinjasCadastrados++;
                            break;
                        }
                    }
                    break;
                case 2:
                    if (quantidadeDeNinjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                        break;
                    }
                    System.out.println("\n===== Lista de Ninjas =====");
                    for (int i = 0; i < vagasDeNinjas; i++) {
                        if (ninja[i] != null) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;
                case 3:
                    if (quantidadeDeNinjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                        break;
                    }
                    System.out.println("\n===== Lista de Ninjas =====");
                    for (int i = 1; i <= vagasDeNinjas; i++) {
                        if (ninja[i - 1] != null) {
                            System.out.println(i + ". " + ninja[i - 1]);
                        }
                    }
                    int indiceParaDeletar;

                    System.out.println("Escolha uma opção para remover:");
                    System.out.print("> ");
                    indiceParaDeletar = caixaDeTexto.nextInt() - 1;
                    ninja[indiceParaDeletar] = null;
                    quantidadeDeNinjasCadastrados--;
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

        caixaDeTexto.close();
    }
}
