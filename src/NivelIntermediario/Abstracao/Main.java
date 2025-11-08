package NivelIntermediario.Abstracao;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto");
        Uchiha sasuke = new Uchiha("Sakuke");

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.estrategiaDeCombate();

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.estrategiaDeCombate();
    }
}
