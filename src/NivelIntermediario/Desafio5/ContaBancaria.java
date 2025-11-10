package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Valor da conta: " + saldo);
    }

    @Override
    public abstract void depositar(double valor);
}
