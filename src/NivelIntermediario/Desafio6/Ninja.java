package NivelIntermediario.Desafio6;

record Ninja(String nome, int idade, String vila) {
    @Override
    public String toString() {
        return "Nome: " + nome
        + "\nIdade: " + idade
        + "\nVila: " + vila;
    }
}
