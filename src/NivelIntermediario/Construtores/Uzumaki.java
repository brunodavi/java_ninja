package NivelIntermediario.Construtores;

import NivelIntermediario.Heranca.Ninja;

public class Uzumaki extends Ninja {
    public Uzumaki() {}
    public Uzumaki(String nome, int idade, String aldeia, String missao, String statusMissao, String nivelDificuldade, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.missao = missao;
        this.statusMissao = statusMissao;
        this.nivelDificuldade = nivelDificuldade;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public void ativarHabilidadeEspecial() {
        System.out.println(nome + " ativou o modo sábio");
    }

    public void ativarModoSabio() {
        System.out.println(nome + " ativou o modo sábio");
    }
}
