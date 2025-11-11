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

    public void exibirDetalhes() {
        System.out.println("======= Detalhes da Missão =======");
        System.out.println("Nome: " + nome);
        System.out.println("Rank: " + rank);
        System.out.println("- Descrição: " + rank.descricao);
        System.out.println("- Dificuldade: " + rank.dificuldade);
    }

    @Override
    public String toString() {
        return "Missao{" +
                "nome='" + nome + '\'' +
                ", rank=" + rank +
                '}';
    }
}