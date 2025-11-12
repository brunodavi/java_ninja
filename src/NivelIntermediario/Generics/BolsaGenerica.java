package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void addEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    public void delEquipamento(T equipamento) {
        equipamentos.remove(equipamento);
    }

    @Override
    public String toString() {
        return "BolsaGenerica{" +
                "equipamentos=" + equipamentos +
                '}';
    }
}
