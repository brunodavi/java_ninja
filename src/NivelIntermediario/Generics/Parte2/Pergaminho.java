package NivelIntermediario.Generics.Parte2;

public class Pergaminho extends EquipamentoNinja {
    private String conteudo;

    public Pergaminho(String descricao, String conteudo) {
        super(descricao);
        this.conteudo = conteudo;
    }

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho{" +
                "descricao='" + descricao + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
