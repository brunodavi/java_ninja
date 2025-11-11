package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", NivelNinja.HOKAGE);
        Uzumaki boruto = new Uzumaki("Baruto", NivelNinja.JONIN);

        RankDeMissao rank = RankDeMissao.nivelNinjaParaRank(boruto.nivelNinja);
        Missao missao = new Missao("Eliminar Inimigo", rank);

        naruto.darMissao(boruto, missao);

        System.out.println(boruto);
    }
}
