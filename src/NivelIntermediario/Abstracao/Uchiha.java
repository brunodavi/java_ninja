package NivelIntermediario.Abstracao;

public class Uchiha extends Ninja {
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome + " Uchiha", idade, aldeia);
    }

    public Uchiha(String nome) {
        this.nome = nome + " Uchiha";
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
