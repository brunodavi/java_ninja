package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        Ninja ninjaBasico = new NinjaBasico(
                "Ninja Basico 1",
                34,
                "Taijutsu"
        );

        Ninja ninjaAvancado = new NinjaAvancado(
                "Ninja Avançado 1",
                34,
                "Katon",
                "Fogo"
        );

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}

