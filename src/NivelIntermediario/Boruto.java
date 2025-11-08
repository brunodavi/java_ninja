package NivelIntermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki {
    Boruto(String nome) {
        super(nome);
    }

    @Override
    public void AtivarKarma() {
        System.out.println("O Karma ativou");
    }

    @Override
    public void AtivarJogan() {
        System.out.println("O Jogan ativou");
    }
}
