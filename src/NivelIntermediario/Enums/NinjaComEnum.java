package NivelIntermediario.Enums;


public abstract class NinjaComEnum {
    String nome;
    NivelNinja nivelNinja;
    Missao missao = null;

    public NinjaComEnum(String nome, NivelNinja nivelNinja) {
        this.nome = nome;
        this.nivelNinja = nivelNinja;
    }

    @Override
    public String toString() {
        return "NinjaComEnum{" +
                "nome='" + nome + '\'' +
                ", nivelNinja=" + nivelNinja +
                ", missao=" + missao +
                '}';
    }

    public void darMissao(NinjaComEnum ninja, Missao missao) {
        if (ninja.missao == null) {
            if (nivelNinja == NivelNinja.HOKAGE || nivelNinja == NivelNinja.JONIN) {
                System.out.println(nome + " entregou a missão rank " + missao.getRank() + " para " + ninja.nome);
                ninja.missao = missao;
            } else {
                System.out.println("Você não pode dar missões tendo esse nível ninja");
            }
        } else {
            System.out.println("Você já possui uma missão");
        }
    }
}
