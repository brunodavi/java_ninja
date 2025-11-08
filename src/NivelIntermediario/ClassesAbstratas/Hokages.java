package NivelIntermediario.ClassesAbstratas;

// Não pode ser criada sem ser herdada antes
public abstract class Hokages {
    Hokages() {}

    Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    String nome;
    int idade;
    boolean vivoOuNao;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Está vivo: " + (vivoOuNao ? "Sim" : "Não"));
    }

    public abstract void obterSabedoriaHokage();
}