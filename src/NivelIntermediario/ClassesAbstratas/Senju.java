package NivelIntermediario.ClassesAbstratas;

public class Senju extends Hokages {
    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    @Override
    public void obterSabedoriaHokage() {
        System.out.println("Obteve a sabedoria hokage");
    }
}
