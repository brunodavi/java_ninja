package NivelIntermediario.Abstracao;

public class Uzumaki extends Ninja {
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome + " Uzumaki", idade, aldeia);
    }

    public Uzumaki(String nome) {
        this.nome = nome + " Uzumaki";
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " ativou o razengan");
    }

    // Quando não feita na classe mãe tem que ser implementada
    // nas classes filhas
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia: sair batendo em tudo que se move e fazer o discurso motivacional");
    }
}
