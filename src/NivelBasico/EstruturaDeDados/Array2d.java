package NivelBasico.EstruturaDeDados;

public class Array2d {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];

        String[] aldeiaFolha = ninjasEAldeias[0];
        String[] aldeiaAreia = ninjasEAldeias[1];
        String[] aldeiaSom = ninjasEAldeias[2];

        aldeiaFolha[0] = "Aldeia da Folha";
        aldeiaFolha[1] = "Naruto";
        aldeiaFolha[2] = "Sasuke";

        aldeiaAreia[0] = "Aldeia da Areia";
        aldeiaAreia[1] = "Gaara";
        aldeiaAreia[2] = "Temari";

        aldeiaSom[0] = "Aldeia do Som";
        aldeiaSom[1] = "Orochimaru";
        aldeiaSom[2] = "Kabuto Yakushi";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            for (int j = 0; j < ninjasEAldeias.length; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
            System.out.println("----------------------------------");
        }
    }
}
