package NivelIntermediario.Abstracao;

public abstract class Ninja implements EstrategiaDeBatalhaNinja {
    // TODO: Adicionar 2 novos atributos: missoesConcluidas e rank
    String nome;
    int idade;
    String aldeia;
    int missoesConcluidas;
    NivelNinja rank;
    String clan;

    public Ninja() {
    }

    public Ninja(String nome) {
        this.clan = this.getClass().getSimpleName();
        this.nome = nome + " " + clan;
    }

    public Ninja(String nome, int idade, String aldeia) {
        this(nome);
        this.idade = idade;
        this.aldeia = aldeia;
    }

    // Todo: Sobrecarga de construtor com os novos atributos
    public Ninja(String nome, int idade, String aldeia, int missoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.missoesConcluidas = missoesConcluidas;
        this.rank = rank;
    }

    public abstract void habilidadeEspecial();

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Clan: " + clan);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Missões Concluídas: " + missoesConcluidas);
        System.out.println("Nível do Ninja: " + rank);
    }

    // Quando declarado na classe mãe não precisa refazer nas
    // classes filhas
    @Override
    public void estrategiaDeCombate() {
        System.out.println("Essa é minha estrategia de combate");
    }
}
