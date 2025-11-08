package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String missaoConcluida;

        String ninjaNome1 = "Naruto";
        int ninjaIdade1 = 14;
        String ninjaMissao1 = "Encontrar gato perdido";
        boolean ninjaMissaoConcluida1;
        char ninjaMissaoNivel1 = 'B';

        if (ninjaIdade1 < 15) {
            if (ninjaMissaoNivel1 == 'D') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida1 = true;
            } else if (ninjaMissaoNivel1 == 'C') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida1 = true;
            } else {
                missaoConcluida = "não concluída";
                ninjaMissaoConcluida1 = false;
            }
        } else {
            missaoConcluida = "concluída";
            ninjaMissaoConcluida1 = true;
        }

        System.out.println("\n--- Ninja 1 ---");
        System.out.println("Nome: " + ninjaNome1);
        System.out.println("Idade: " + ninjaIdade1);

        System.out.println("Missão: " + ninjaMissao1);
        System.out.println("Missão Nível: " + ninjaMissaoNivel1);
        System.out.println("Missão Concluída (boolean): " + ninjaMissaoConcluida1);
        System.out.println("Missão Concluída: " + missaoConcluida);

        String ninjaNome2 = "Sasuke";
        int ninjaIdade2 = 16;
        String ninjaMissao2 = "Derrotar ninja inimigo";
        boolean ninjaMissaoConcluida2;
        char ninjaMissaoNivel2 = 'B';

        if (ninjaIdade2 < 15) {
            if (ninjaMissaoNivel2 == 'D') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida2 = true;
            } else if (ninjaMissaoNivel2 == 'C') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida2 = true;
            } else {
                missaoConcluida = "não concluída";
                ninjaMissaoConcluida2 = false;
            }
        } else {
            missaoConcluida = "concluída";
            ninjaMissaoConcluida2 = true;
        }

        System.out.println("\n--- Ninja 2 ---");
        System.out.println("Nome: " + ninjaNome2);
        System.out.println("Idade: " + ninjaIdade2);

        System.out.println("Missão: " + ninjaMissao2);
        System.out.println("Missão Nível: " + ninjaMissaoNivel2);
        System.out.println("Missão Concluída (boolean): " + ninjaMissaoConcluida2);
        System.out.println("Missão Concluída: " + missaoConcluida);

        String ninjaNome3 = "Sakura";
        int ninjaIdade3 = 15;
        String ninjaMissao3 = "Pegar ervas medicinais";
        boolean ninjaMissaoConcluida3;
        char ninjaMissaoNivel3 = 'C';

        if (ninjaIdade3 < 15) {
            if (ninjaMissaoNivel3 == 'D') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida3 = true;
            } else if (ninjaMissaoNivel3 == 'C') {
                missaoConcluida = "concluída";
                ninjaMissaoConcluida3 = true;
            } else {
                missaoConcluida = "não concluída";
                ninjaMissaoConcluida3 = false;
            }
        } else {
            missaoConcluida = "concluída";
            ninjaMissaoConcluida3 = true;
        }

        System.out.println("\n--- Ninja 3 ---");
        System.out.println("Nome: " + ninjaNome3);
        System.out.println("Idade: " + ninjaIdade3);

        System.out.println("Missão: " + ninjaMissao3);
        System.out.println("Missão Nível: " + ninjaMissaoNivel3);
        System.out.println("Missão Concluída (boolean): " + ninjaMissaoConcluida3);
        System.out.println("Missão Concluída: " + missaoConcluida);
    }
}
