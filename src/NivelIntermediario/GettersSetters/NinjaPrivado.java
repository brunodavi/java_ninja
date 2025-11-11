package NivelIntermediario.GettersSetters;

public abstract class NinjaPrivado {
    private String nome;
    private final String clan;
    private int idade;
    private int missoesConcluidas;

    public NinjaPrivado(String nome, int idade, int missoesConcluidas) {
        this.nome = nome;
        this.clan = this.getClass().getSimpleName();
        this.idade = idade;
        this.missoesConcluidas = missoesConcluidas;
    }

    public String getNome() {
        return nome + " " + clan;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClan() {
        return clan;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (this.idade > idade) {
            System.out.println("A idade não pode ser menor que " + idade);
            return;
        }

        this.idade = idade;
    }

    public int getMissoesConcluidas() {
        return missoesConcluidas;
    }

    public void setMissoesConcluidas(int missoesConcluidas) {
        if (this.missoesConcluidas > missoesConcluidas) {
            System.out.println("Missões concluídas não podem ser menores que " + this.missoesConcluidas);
            return;
        }

        this.missoesConcluidas = missoesConcluidas;
    }

    @Override
    public String toString() {
        return "NinjaPrivado{" +
                "nome='" + nome + '\'' +
                ", clan='" + clan + '\'' +
                ", idade=" + idade +
                ", missoesConcluidas=" + missoesConcluidas +
                '}';
    }
}
