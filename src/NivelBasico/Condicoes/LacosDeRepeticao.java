package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de Repetição - Forma de repetir um trecho de código até que a condição seja false
        * WHILE / FOR
        * while (condição) {código}
        * for (inicialização; condição; incrementador)
        * Objetivo:
        */

        boolean irNoWhile = true;
        int numeroMaximoDeClones = 40;

        if (irNoWhile) {
            int numeroDeClones = 0;

            while (numeroDeClones < numeroMaximoDeClones) {
                numeroDeClones = numeroDeClones + 1; // numeroDeClones++;
                System.out.println("Naruto criou: " + numeroDeClones + " clones");
            }
        } else {
            for (int numeroDeClones = 1; numeroDeClones <= numeroMaximoDeClones; numeroDeClones++) {
                System.out.println("Naruto criou: " + numeroDeClones + " clones");
            }
        }

        System.out.println("Naruto chegou ao máximos de clones criados hoje");
    }
}
