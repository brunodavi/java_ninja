package NivelIntermediario.Sobrecarga;

import NivelIntermediario.Abstracao.NivelNinja;
import NivelIntermediario.Abstracao.Uchiha;

public class Main {
    public static void main(String[] args) {
        Uchiha madara = new Uchiha(
                "Marara",
                45,
                "Aldeia da Folha",
                900,
                NivelNinja.KAGE
        );

        System.out.println(madara);
    }
}
