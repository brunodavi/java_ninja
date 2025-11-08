package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados Primitivos:
            * int: Números inteiros.
            * float: Números de ponto flutuante de precisão simples.
            * double: Números de ponto flutuante de precisão dupla.
            * char: Um único caractere.
            * boolean: Valores verdadeiros ou falsos.
            * byte: Números inteiros pequenos.
            * short: Números inteiros menores que um int.
            * long: Números inteiros maiores que um int.

        * Objetivo da Aula: Cria um ninja - Naruto
        */

        int valorMaximo = 2_147_483_647;
//        int valorAlemDoMaximo = 2_147_483_648; // Erro de compilação

        int idade = 16; // Valor maximo do int: 2.147.483.647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;

        long saldoBancario = 2_147_483_648L; // Valor maximo 9 trilhões e alguma coisa

        System.out.println("Idade: " + idade);
        System.out.println("Atura: " + altura);
        System.out.println("Inicial do Nome: " + inicial);
        System.out.println("Está Vivo ou morto: " + vivoOuMorto);
        System.out.println("Salto Bancário " + saldoBancario);
    }
}
