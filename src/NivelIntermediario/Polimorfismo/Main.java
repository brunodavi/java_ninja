package NivelIntermediario.Polimorfismo;

import NivelIntermediario.Heranca.Ninja;

public class Main {
    public static void main(String[] args) {
        Ninja sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.ativarHabilidadeEspecial();
    }
}
