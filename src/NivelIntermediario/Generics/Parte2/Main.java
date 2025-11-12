package NivelIntermediario.Generics.Parte2;

public class Main {
    public static void main(String[] args) {
        Kunai kunai = new Kunai("Explosiva");
        Shuriken shuriken = new Shuriken("De Fogo");
        Pergaminho pergaminho = new Pergaminho(
                "Oculto",
                "Instruções dos clones das sombras..."
        );

        BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(shuriken);
        bolsaGenerica.adicionarEquipamento(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
