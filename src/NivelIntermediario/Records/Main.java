package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        CadastroNinjaSemRecords cadastroNinjaSemRecords = new CadastroNinjaSemRecords(
                "Naruto",
                "narutinho@gmail.com",
                11_9_1234_1234L
        );

        CadastroNinja cadastroNinja = new CadastroNinja(
                "Sasuke",
                "sasukedoodio@gmail.com",
                11_9_1234_1234L
        );

        System.out.println(cadastroNinjaSemRecords);
        System.out.println(cadastroNinja);
    }
}
