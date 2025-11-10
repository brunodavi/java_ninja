package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta Corrente:");
        ContaCorrente contaCorrente = new ContaCorrente(0);

        contaCorrente.depositar(100);
        contaCorrente.consultarSaldo();

        System.out.println("------------------------------------------");

        System.out.println("Conta Poupança:");
        ContaPoupanca contaPoupanca = new ContaPoupanca(0);

        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
    }
}
