package NivelIntermediario.Enums;

public class Missao {
    private final String nome;
    private final RankDeMissao rank;

    public Missao(String nome, RankDeMissao rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public RankDeMissao getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Missao{" +
                "nome='" + nome + '\'' +
                ", rank=" + rank +
                '}';
    }
}