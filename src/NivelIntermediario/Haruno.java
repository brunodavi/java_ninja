package NivelIntermediario;

public class Haruno extends Ninja {
    Haruno(String nome) {
        this.nome = nome + " Haruno";
    }

    public void curar(Ninja ninja) {
        System.out.println(nome + " curou " + ninja.nome);
    }
}
