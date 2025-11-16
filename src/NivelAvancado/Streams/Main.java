package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjas.add(new Ninja("Hinata Hyuga", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 18, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        ninjas.add(new Ninja("Itachi Uchiha", 21, "Konoha"));
        ninjas.add(new Ninja("Gaara", 17, "Suna"));

        Stream<Ninja> ninjasStream = ninjas.stream();
        ninjasStream
                .filter(ninja -> ninja.idade() == 17)
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.nome(), n2.nome()))
                .forEach(System.out::println);
    }
}
