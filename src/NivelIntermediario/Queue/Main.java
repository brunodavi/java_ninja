package NivelIntermediario.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queues ou Filas
        Queue<String> queue = new LinkedList<>();
        queue.add("Naruto");
        queue.add("Sasuke");
        queue.add("Sakura");

        // Mostra o primeiro da fila (Naruto)
        System.out.println(queue.peek());
        System.out.println(queue);

        // Remove o primeiro (Naruto foi atendido)
        System.out.println(queue.poll() + " foi atendido");
        System.out.println(queue);

        // Sasuke vai ser atendido agora
        System.out.println(queue.peek() + " foi atendido");
        System.out.println(queue);
    }
}
