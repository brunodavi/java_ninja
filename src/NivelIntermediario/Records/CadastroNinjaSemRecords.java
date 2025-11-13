package NivelIntermediario.Records;

public class CadastroNinjaSemRecords {
    private final String nome;
    private final String email;
    private final long telefone;

    public CadastroNinjaSemRecords(String nome, String email, long telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "CadastroNinjaSemRecords{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
