package NivelIntermediario;

import java.util.Scanner;

public class GerenciadorDeNinjas {
    Ninja[] ninjas = new Ninja[3];
    int ninjasCadastrados = 0;
    Scanner scanner = new Scanner(System.in);

    public int obterNumeroNoMenu(String[] opcoes, String titulo) {
        System.out.println(titulo);

        for (int i = 1; i <= opcoes.length; i++) {
            String opcao = opcoes[i - 1];
            if (opcao != null) {
                System.out.println(i + ") " + opcao);
            }
        }

        int opcaoSelecionada = 0;

        while (opcaoSelecionada <= 0 || opcaoSelecionada > opcoes.length) {
            System.out.print("\nSelecione um número: ");
            opcaoSelecionada = scanner.nextInt();
            scanner.nextLine();

            if (opcaoSelecionada <= 0 || opcaoSelecionada > opcoes.length) {
                System.out.println("Opção invalida");
            }
        }

        return opcaoSelecionada;
    }

    public String obterStringNoMenu(String[] opcoes, String titulo) {
        int opcaoSelecionada = obterNumeroNoMenu(opcoes, titulo);
        return opcoes[opcaoSelecionada - 1];
    }

    public Ninja obterNinjaNoMenu(String titulo) {
        if (ninjasCadastrados == 0) {
            System.out.println("Não há ninjas cadastrados");
        }

        String[] ninjaNomes = new String[ninjas.length];

        for (int i = 0; i < ninjaNomes.length; i++) {
            if (ninjas[i] != null) {
                ninjaNomes[i] = ninjas[i].nome;
            }
        }

        int opcaoSelecionada = obterNumeroNoMenu(ninjaNomes, titulo);
        return ninjas[opcaoSelecionada - 1];
    }

    public String obterTextoDoUsuario(String pergunta) {
        String resultado = "";

        while (resultado.isEmpty()) {
            System.out.print(pergunta + ": ");

            resultado = scanner.nextLine();
            if (resultado.isEmpty()) {
                System.out.println("Opção invalida");
            }
        }

        return resultado;
    }

    public int obterNumeroPositivoDoUsuario(String pergunta) {
        int resultado = 0;

        while (resultado == 0) {
            System.out.print(pergunta + ": ");

            resultado = scanner.nextInt();
            scanner.nextLine();

            if (resultado == 0) {
                System.out.println("Opção invalida");
            }
        }

        return resultado;
    }

    public void cadastrarNinja() {
        if (ninjasCadastrados >= ninjas.length) {
            System.out.println("Passou a quantidade de ninjas cadastrados");
            return;
        }

        Ninja ninja = new Ninja();

        ninja.nome = obterTextoDoUsuario("Nome");
        ninja.idade = obterNumeroPositivoDoUsuario("Idade");
        ninja.aldeia = obterTextoDoUsuario("Aldeia");
        ninja.missao = obterTextoDoUsuario("Missão");

        String[] niveisDeDificuldades = { "A", "B", "C", "D", "E", "F" };
        ninja.nivelDificuldade = obterStringNoMenu(niveisDeDificuldades, "Níveis de dificuldade");

        String[] statusMissaoOpcoes = {
                "Não iniciado",
                "Em andamento",
                "Concluído"
        };

        ninja.statusMissao = obterStringNoMenu(statusMissaoOpcoes, "Status da Missão");

        ninjas[ninjasCadastrados] = ninja;
        ninjasCadastrados++;

        System.out.println(ninjasCadastrados + " ninja cadastrado");
    }

    public void atualizarHabilidadeEspecialNinja(Ninja ninja) {
        boolean possuiHabilidadeEspecial = ninja.habilidadeEspecial != null;
        String pergunta = possuiHabilidadeEspecial
                ? "Substituir " + ninja.habilidadeEspecial + "por"
                : "Adicionar habilidade ao ninja";

        String resposta = possuiHabilidadeEspecial
                ? "Habilidade substituída"
                : "Habilidade adquirida";

        ninja.habilidadeEspecial = obterTextoDoUsuario(pergunta);
        System.out.println(resposta);
    }

    public void exibirInformacoesTodosNinjas() {
        if (ninjasCadastrados == 0) {
            System.out.println("Não há ninjas cadastrados");
        }

        System.out.println();

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                System.out.println("==============================");
                ninjas[i].mostrarInformacoes();
            }
        }

        System.out.println();
    }

    public void sair() {
        scanner.close();
    }
}
