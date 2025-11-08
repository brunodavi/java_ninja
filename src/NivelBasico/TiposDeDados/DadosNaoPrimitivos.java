package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Enum, Class
        * Objetivo: Criar um ninja e atribuir métodos nele
        * Obs: A diferença entre o não primitivo é que seu valor tem métodos
        */

        String nomeNormal = "Naturo Uzumaki";

        String nomeMaiusculo = nomeNormal.toUpperCase(); // Vai deixar todas as letras maiúsculas
        String nomeMinusculo = nomeNormal.toLowerCase(); // Vai deixar todas as letras minúsculas

        System.out.println("Nome Normal: " + nomeNormal);
        System.out.println("Nome Maiúsculo: " + nomeMaiusculo);
        System.out.println("Nome Minúsculo: " + nomeMinusculo);
    }
}
