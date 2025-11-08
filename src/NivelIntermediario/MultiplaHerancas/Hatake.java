package NivelIntermediario.MultiplaHerancas;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface {
    public Hatake(String nome, int idade, String aldeia) {
        super(nome, "Hatake", idade, aldeia);
    }

    public void boasVindas() {
        System.out.println("Olá eu sou um " + clan);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(getNomeCompleto() + ": Ativou o sharingan roubado");
    }

    @Override
    public void bemVindoAAmbu() {
        System.out.println("Olá, meu nome é " + getNomeCompleto() + " e faço parte da Ambu");
    }
}
