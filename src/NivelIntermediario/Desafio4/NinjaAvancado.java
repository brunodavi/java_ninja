package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executou a habilidade " + habilidade + " com minha especialidade de " + especialidade);
    }
}
