package NivelIntermediario.MultiplaHerancas;

public abstract class Ninja {
    String nome;
    String clan;

    int idade;
    String aldeia;

    public Ninja(String nome, String clan, int idade, String aldeia) {
        this.nome = nome;
        this.clan = clan;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNomeCompleto() {
        return nome + " " + clan;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
    }
}
