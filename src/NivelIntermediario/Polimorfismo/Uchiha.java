package NivelIntermediario.Polimorfismo;

import NivelIntermediario.Heranca.Ninja;

public class Uchiha extends Ninja {
    String habilidadeEspecial = "Sharingan";

    @Override
    public void ativarHabilidadeEspecial() {
        System.out.println(nome + " ativou o sharingan");
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
