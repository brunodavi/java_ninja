package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta correte: " + valor);
        this.saldo += valor;
    }
}
