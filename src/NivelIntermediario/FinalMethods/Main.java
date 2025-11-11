package NivelIntermediario.FinalMethods;

import NivelIntermediario.Abstracao.Ninja;
import NivelIntermediario.Abstracao.Uzumaki;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto");

        // A classe Uzumaki tentou sobrescrever
        naruto.tacarKunai();
        System.out.println(naruto.altura);
    }
}
