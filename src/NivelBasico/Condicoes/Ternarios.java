package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternários: Simplificação do if else para simplificar o código
        * Exemplo: (condição) ? valorVerdadeiro : valorFalso
        * Objetivo:
        */

        short nivelMissao = 9;

        String missao = (nivelMissao >= 10)
                ? "Missão nível S"
                : "Missão nível A";

        System.out.println(missao);
    }
}
