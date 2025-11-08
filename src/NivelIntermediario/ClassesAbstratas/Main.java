package NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Senju tobirama = new Senju(
                "Tobirama",
                49,
                false
        );

        tobirama.mostrarInformacoes();
        tobirama.obterSabedoriaHokage();
    }
}
