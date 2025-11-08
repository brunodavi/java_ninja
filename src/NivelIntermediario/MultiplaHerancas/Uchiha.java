package NivelIntermediario.MultiplaHerancas;

public class Uchiha extends Ninja implements SharinganInterface {
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, "Uchiha", idade, aldeia);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(getNomeCompleto() + ": Ativou o sharingan");
    }
}
