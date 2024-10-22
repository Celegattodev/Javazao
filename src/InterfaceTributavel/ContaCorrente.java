package InterfaceTributavel;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calcularTributos() {
        double saldo = obterSaldo();
        return saldo*0.01;
    }

    public ContaCorrente(double saldo) {
    }
}
