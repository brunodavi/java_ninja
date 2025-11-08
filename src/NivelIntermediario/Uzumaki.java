package NivelIntermediario;

public class Uzumaki extends Ninja {
    Uzumaki(String nome) {
        this.nome = nome + " Uzumaki";
    }

    @Override
    public void ativarHabilidadeEspecial() {
        System.out.println(nome + " ativou o modo sábio");
    }

    public void ativarModoSabio() {
        System.out.println(nome + " ativou o modo sábio");
    }
}
