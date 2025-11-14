package NivelIntermediario.Desafio6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Menu {
    Scanner scanner;
    List<Ninja> ninjas;

    public Menu() {
        scanner = new Scanner(System.in);
        ninjas = new LinkedList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjas.add(new Ninja("Hinata Hyuga", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 18, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        ninjas.add(new Ninja("Itachi Uchiha", 21, "Konoha"));
        ninjas.add(new Ninja("Gaara", 17, "Suna"));
    }

    public void iniciar() {
        mostrarMenu();
        int opcaoSelecionada = obterNumero("Selecione uma das opções: ");

        switch (opcaoSelecionada) {
            case 1:
                adicionarNinja();
                break;
            case 2:
                atualizarNinja();
                break;
            case 3:
                removerNinja();
                break;
            case 4:
                listarNinjas();
                break;
            case 5:
                buscarUmNinja();
                break;
            case 6:
                sair();
                return;
            default:
                System.out.println("Opção inválida");
                break;
        }

        iniciar();
    }

    public void adicionarNinja() {
        Ninja ninja = criarNinja();
        System.out.println(ninja.nome() + " adicionado");
        ninjas.add(0, ninja);
    }

    public void atualizarNinja() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja foi adicionado");
            return;
        }
        int indice = buscarIndiceDoNinja();
        Ninja ninja = ninjas.get(indice);
        System.out.println("Ninja selecionado: " + ninja.nome());
        System.out.println("Substituindo ninja: ");
        Ninja novoNinja = criarNinja();
        System.out.println(novoNinja.nome());
        boolean confirmado = obterConfirmacao("Deseja substituir esse ninja?");
        if (confirmado) {
            ninjas.set(indice, novoNinja);
            System.out.println("Ninja substituído com sucesso");
        } else {
            System.out.println("Operação cancelada");
        }
    }

    public void removerNinja() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja foi adicionado");
            return;
        }
        Ninja ninjaRemovido = buscarNinja();
        boolean confirmado = obterConfirmacao("Tem certeza que quer remover esse ninja?");
        if (confirmado) {
            ninjas.remove(ninjaRemovido);
            System.out.println("Ninja removido com sucesso");
        } else {
            System.out.println("Operação cancelada");
        }
    }

    public void listarNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja foi adicionado");
            return;
        }
        int count = 1;
        for (Ninja ninja : ninjas) {
            System.out.println(count + ") " + ninja.nome());
            count++;
        }
    }

    public void buscarUmNinja() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja foi adicionado");
            return;
        }
        Ninja ninja = buscarNinja();
        System.out.println(ninja);
    }

    public void sair() {
        System.out.println("Saindo...");
        scanner.close();
    }

    public void mostrarMenu() {
        String div = "----------";
        System.out.println(div + " Sistema Ninja " + div);
        System.out.println("1) Adicionar ninja");
        System.out.println("2) Atualizar ninja");
        System.out.println("3) Remover ninja");
        System.out.println("4) Listar ninjas");
        System.out.println("5) Buscar ninja");
        System.out.println("6) Sair");
    }

    public Ninja criarNinja() {
        return new Ninja(
                obterTexto("Nome: "),
                obterNumero("Idade: "),
                obterTexto("Vila: ")
        );
    }

    public int buscarIndiceDoNinja() {
        listarNinjas();
        int numeroSelecionado = obterNumero("Selecione um ninja: ");

        if (numeroSelecionado < 0 || numeroSelecionado > ninjas.size()) {
            System.out.println("Índice indisponível");
            numeroSelecionado = buscarIndiceDoNinja();
        }

        return numeroSelecionado - 1;
    }

    public Ninja buscarNinja() {
        int indice = buscarIndiceDoNinja();
        Ninja ninja = ninjas.get(indice);
        System.out.println("Ninja selecionado: " + ninja.nome());
        return ninja;
    }

    public int obterNumero(String pergunta) {
        System.out.print(pergunta);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception error) {
            System.out.println("Erro: digite um número");
            return obterNumero(pergunta);
        } finally {
            scanner.reset();
        }
    }

    public String obterTexto(String pergunta) {
        System.out.print(pergunta);
        try {
            String result = scanner.nextLine();

            if (result.isEmpty()) {
                throw new Exception();
            }

            return result;
        } catch (Exception error) {
            System.out.println("Erro: digite um texto válido");
            return obterTexto(pergunta);
        } finally {
            scanner.reset();
        }
    }

    public boolean obterConfirmacao(String pergunta) {
        System.out.print(pergunta + " [S/n]");
        String result = scanner.nextLine().trim().toUpperCase();
        return result.equals("S") || result.isEmpty();
    }
}
