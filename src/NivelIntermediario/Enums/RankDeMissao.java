package NivelIntermediario.Enums;

public enum RankDeMissao {
    D("Fácil", 1),
    C("Básico", 2),
    B("Normal", 3),
    A("Difícil", 4),
    S("Especial", 5);

    String descricao;
    int dificuldade;

    RankDeMissao(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public static RankDeMissao nivelNinjaParaRank(NivelNinja nivelNinja) {
        return switch (nivelNinja) {
            case GENIN -> D;
            case CHUNIN -> C;
            case JONIN -> B;
            case GENIO -> A;
            case HOKAGE -> S;
        };
    }
}
