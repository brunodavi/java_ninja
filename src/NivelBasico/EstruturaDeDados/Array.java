package NivelBasico.EstruturaDeDados;

public class Array {
    public static void main(String[] args) {
        /*
        * Array - Referencia para localizar dados na memória fixos
        */

        int espacosDoArray = 4;

        String[] ninjas = new String[espacosDoArray];
        int[] ninjaIdades = new int[espacosDoArray];
        boolean[] ninjaMissaoConcluida = new boolean[espacosDoArray];
        char[] ninjaMissaoNivel = new char[espacosDoArray];
        double[] ninjaAltura = new double[espacosDoArray];

        short[] numeroDeNinjas = { 1, 2, 3, 0 };
        float[] avaliacaoNinja = new float[] { 4.5f, 5.0f, 4.8f, 0.0f, };

        ninjas[0] = "Naruto";
        ninjaIdades[0] = 16;
        ninjaAltura[0] = 1.65;
        ninjaMissaoNivel[0] = 'E';
        ninjaMissaoConcluida[0] = false;

        ninjas[1] = "Sasuke";
        ninjaIdades[1] = 17;
        ninjaAltura[1] = 1.70;
        ninjaMissaoNivel[1] = 'C';
        ninjaMissaoConcluida[1] = true;

        ninjas[2] = "Sakura";
        ninjaIdades[2] = 15;
        ninjaAltura[2] = 1.60;
        ninjaMissaoNivel[2] = 'D';
        ninjaMissaoConcluida[2] = true;

        // Cria uma nova referência do array e a anterior será
        // apagada automaticamente
        // ninjaMissaoConcluida = new boolean[espacosDoArray];

        for (int i = 0; i < espacosDoArray; i++) {
            System.out.println("Ninja: " + numeroDeNinjas[i]);
            System.out.println("Nome: " + ninjas[i]);
            System.out.println("Idade: " + ninjaIdades[i]);
            System.out.println("Altura: " + ninjaAltura[i]);
            System.out.println("Missão Nível: " + ninjaMissaoNivel[i]);
            System.out.println("Missão Concluída: " + ninjaMissaoConcluida[i]);
            System.out.println("Avaliação do Ninja: " + avaliacaoNinja[i]);
            System.out.println("------------------------------------");
        }

/*
        String ninja1 = "Naruto";
        String ninja2 = "Sesuke";
        String ninja3 = "Sakura";

        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
*/
    }
}
