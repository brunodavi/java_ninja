package NivelIntermediario.Desafio5;

public class BancoKonoha extends ContaBancaria {
    public BancoKonoha(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta do banco Konoha" + valor);
        double taxa = 0;

        if (tipoConta == TipoConta.POUPANCA) {
            System.out.println("Aviso taxa de 1%");
            taxa = valor * 0.01;
        }

        this.saldo += valor - taxa;
    }

    public void transferencia(ContaBancaria destino, double valor) {
        System.out.println("Valor transferência: " + valor);
        double taxa = 0;

        if (tipoConta == TipoConta.POUPANCA) {
            System.out.println("Aviso taxa de 1%");
            taxa = valor * 0.01;
        }

        this.saldo -= valor - taxa;
        destino.saldo += valor;
    }
}
