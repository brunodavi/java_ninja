package NivelIntermediario.Abstracao;

public abstract class Ninja implements EstrategiaDeBatalhaNinja {
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public abstract void habilidadeEspecial();

    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("aldeia = " + aldeia);
    }

    // Quando declarado na classe mãe não precisa refazer nas
    // classes filhas
    @Override
    public void estrategiaDeCombate() {
        System.out.println("Essa é minha estrategia de combate");
    }
}
