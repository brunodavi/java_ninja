package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] ninjasArray = {
                "Naruto",
                "Sasuke",
                "Sakura",
        };

        System.out.println(ninjasArray);

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");

        System.out.println(ninjasList);

        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");

        System.out.println(ninjasStack);
        System.out.println(ninjasStack.peek());
        System.out.println(ninjasStack.pop());
        System.out.println(ninjasStack);
    }
}
