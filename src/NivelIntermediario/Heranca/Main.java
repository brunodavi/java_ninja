package NivelIntermediario.Heranca;

import NivelIntermediario.Polimorfismo.Uchiha;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;

        sakura.curar(sasuke);
    }
}
