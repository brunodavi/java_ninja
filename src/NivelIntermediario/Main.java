package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama";
        hashirama.idade = 30;
        hashirama.vivoOuNao = false;

        Hokages tobirama = new Hokages(
                "Tobirama",
                49,
                false
        );

        hashirama.mostrarInformacoes();
        System.out.println();
        tobirama.mostrarInformacoes();
    }
}
