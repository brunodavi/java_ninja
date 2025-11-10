package NivelIntermediario.Abstracao;

public class Uchiha extends Ninja {
    public Uchiha() {
    }

    public Uchiha(String nome) {
        super(nome);
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int missoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, missoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " ativou o sharingan");
    }

    // Quando não feita na classe mãe tem que ser implementada
    // nas classes filhas
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia: dar golpes estratégicos");
    }
}
