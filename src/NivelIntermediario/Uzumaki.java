package NivelIntermediario;

public class Uzumaki extends Ninja {
    Uzumaki(String nome) {
        this.nome = nome + " Uzumaki";
    }

    public void ativarModoSabio() {
        System.out.println(nome + " ativou o modo sábio");
    }
}
