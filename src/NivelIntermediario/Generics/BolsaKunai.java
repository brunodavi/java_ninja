package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void adicionarKunai(Kunai kunai) {
        kunais.add(kunai);
    }

    public void removerKunai(Kunai kunai) {
        kunais.remove(kunai);
    }

    @Override
    public String toString() {
        return "BolsaKunai{" +
                "kunais=" + kunais +
                '}';
    }
}
