package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Sem Generics ----------");
        semGenerics();

        System.out.println("----------- Com Generics ----------");
        comGenerics();

        System.out.println("----------- Com Generics Como String ----------");
        comGenericsComoString();
    }

    public static void comGenerics() {
        EquipamentoNinja kunai = new EquipamentoNinja("Kunai");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
        EquipamentoNinja pergaminho = new EquipamentoNinja("pergaminho");

        BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(kunai);
        bolsaGenerica.addEquipamento(shuriken);
        bolsaGenerica.addEquipamento(pergaminho);

        System.out.println(bolsaGenerica);
    }

    public static void comGenericsComoString() {
        String kunai = "Kunai";
        String shuriken = "Shuriken";
        String pergaminho = "Pergaminho";

        BolsaGenerica<String> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(kunai);
        bolsaGenerica.addEquipamento(shuriken);
        bolsaGenerica.addEquipamento(pergaminho);

        System.out.println(bolsaGenerica);
    }

    public static void semGenerics() {
        BolsaKunai bolsaKunai = new BolsaKunai();

        Kunai primeiraKunai = new Kunai("1");

        bolsaKunai.adicionarKunai(primeiraKunai);
        bolsaKunai.adicionarKunai(new Kunai("2"));
        bolsaKunai.adicionarKunai(new Kunai("3"));

        bolsaKunai.removerKunai(primeiraKunai);

        System.out.println(bolsaKunai);
    }
}
