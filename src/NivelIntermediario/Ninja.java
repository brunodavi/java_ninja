package NivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    String missao;
    String statusMissao;
    String nivelDificuldade;
    String habilidadeEspecial;

    public String getApresentacao() {
        return "Meu nome é " + nome
                + ", tenho " + idade
                + " anos e sou da " + aldeia;
    }

    public void ativarHabilidadeEspecial() {
        System.out.println(nome + " ativou a habilidade básica");
    }

    public void seApresentar() {
        System.out.println(getApresentacao());
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Missão: " + missao);
        System.out.println("Status Missão: " + statusMissao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
