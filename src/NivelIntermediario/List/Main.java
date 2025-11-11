package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Arrays --------------");
        // Arrays são estáticos, não mudam de tamanho
        String[] ninjasArrays = new String[3];
        ninjasArrays[0] = "Naruto";
        ninjasArrays[1] = "Sasuke";
        ninjasArrays[2] = "Sakura";

        for (int i = 0; i < ninjasArrays.length; i++) {
            System.out.println("ninjasArrays[" + i +  "] = " + ninjasArrays[i]);
        }

        System.out.println("--------------- List --------------");
        // Lista são dinâmicas, mudam de tamanho
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Tobirama");
        ninjasList.add("Kakashi");

        System.out.println(ninjasList);

        // remover primeiro item da lista
        String removedFirst = ninjasList.remove(0);
        System.out.println(removedFirst + " removido");

        // Remover ultimo item da lista
        String removedLast = ninjasList.remove(ninjasList.size() - 1);
        System.out.println(removedLast + " removido");

        // Remover da lista com o elemento
        boolean removedSasuke = ninjasList.remove("Sasuke");
        System.out.println("Sasuke foi removido? " + (removedSasuke ? "Sim" : "Não"));

        // Trocar elemento
        String itemReplaced = ninjasList.set(ninjasList.size() - 1, "Orochimaru");
        System.out.println(itemReplaced + " trocado ");

        // Ver tamanho da lista
        System.out.println(ninjasList.size());

        System.out.println(ninjasList);
    }
}
