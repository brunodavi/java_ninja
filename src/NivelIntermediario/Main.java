package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto");
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";

        Uchiha Sasuke = new Uchiha("Sasuke");
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.missao = "Derrotar ninja inimigo";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.nivelDificuldade = "Raking A";
        Sasuke.mostrarInformacoes();

        Haruno Sakura = new Haruno("Sakura");
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";

    }
}
