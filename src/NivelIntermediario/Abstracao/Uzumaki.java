package NivelIntermediario.Abstracao;

public class Uzumaki extends Ninja {
    public Uzumaki() {
    }

    public Uzumaki(String nome) {
        super(nome);
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int missoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, missoesConcluidas, rank);
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

// Não é possible porque tacarKunai é um final
/*
    @Override
    public void tacarKunai() {
        System.out.println("Taquei uma shrike gigante");
    }
*/
}
