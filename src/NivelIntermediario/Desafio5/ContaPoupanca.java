package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta poupança: " + valor);
        System.out.println("Aviso: Saques tem uma taxa de 10%");
        double taxa = valor * 0.01;
        this.saldo += valor - taxa;
    }
}
