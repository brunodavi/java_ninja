package NivelIntermediario.Generics.Parte2;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    List<T> equipamentos;

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public BolsaGenerica() {
        equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    @Override
    public String toString() {
        return "BolsaGenerica{" +
                "equipamentos=" + equipamentos +
                '}';
    }
}
