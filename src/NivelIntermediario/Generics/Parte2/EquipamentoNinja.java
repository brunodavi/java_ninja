package NivelIntermediario.Generics.Parte2;

public abstract class EquipamentoNinja {
    private final String nome;
    protected final String descricao;

    public EquipamentoNinja(String descricao) {
        this.nome = getClass().getSimpleName();
        this.descricao = descricao;
    }

    public EquipamentoNinja() {
        this("Normal");
    }

    public String getNome() {
        return nome + ' ' + descricao;
    }

    @Override
    public String toString() {
        return nome + "{" +
                "descricao='" + descricao + '\'' +
            '}';
    }
}
