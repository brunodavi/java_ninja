package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * If, Else if e Else - Condições
        * Objetivo: Passar o ninja de nível com base na quantidade de missões
        */

        String nome = "Naruto Uzumaki";
        boolean hokage = false;

        String raking; // Inicialização de variável sem valor
        int idade = 10;
        short numeroDeMissoes = 0;

        idade = 16;
        idade = 35;

        numeroDeMissoes = 4;
        numeroDeMissoes = 10;
        numeroDeMissoes = 25;
        numeroDeMissoes = 101;

        // se (condição ocorrer) { faça isso }

        if (numeroDeMissoes >= 0 && numeroDeMissoes < 10 && idade >= 10 && idade < 15) {
            raking = "Gennim";
        } else if (numeroDeMissoes >= 10 && numeroDeMissoes < 20 && idade > 15) {
            raking = "Chunnin";
        } else if (numeroDeMissoes >= 20 && numeroDeMissoes < 100 && idade > 15) {
            raking = "Jounin";
        } else if (numeroDeMissoes >= 100 && idade >= 18) {
            raking = "Hokage";
            hokage = true;
        } else {
            raking = "Sem Ranking";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Número de Missões: " + numeroDeMissoes);

        System.out.println("Raking: " + raking);

        if (hokage) {
            System.out.println("Esse ninja está no raking mais alto!");
        }
    }
}
