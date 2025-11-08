package NivelIntermediario;

public class Uchiha extends Ninja {
    String habilidadeEspecial = "Sharingan";

    Uchiha(String nome) {
        this.nome = nome + " Uchiha";
    }

    @Override
    public void ativarHabilidadeEspecial() {
        System.out.println(nome + " ativou o sharingan");
    }

    public void ativarSharingan() {
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
