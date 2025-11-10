package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta Corrente:");
        BancoKonoha contaCorrente = new BancoKonoha(0, TipoConta.CORRENTE);

        contaCorrente.depositar(100);
        contaCorrente.consultarSaldo();

        System.out.println("------------------------------------------");

        System.out.println("Conta Poupança:");
        BancoKonoha contaPoupanca = new BancoKonoha(0, TipoConta.POUPANCA);

        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();

        System.out.println("------------------------------------------");
        System.out.println("Transferência da Poupança para Corrente:");

        contaPoupanca.transferencia(contaCorrente, 50);
        contaPoupanca.consultarSaldo();
        contaCorrente.consultarSaldo();
    }
}
