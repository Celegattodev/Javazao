package InterfaceTributavel;

public class Conta {
    private double saldo;

    public boolean depositar(double valor) {
        if(valor>=0) {
            this.saldo+=valor;
            return true;
        }else return false;
    }
    public boolean sacar(double valor) {
        if(valor<=this.saldo) {
            this.saldo-=valor;
            return true;
        }else return false;
    }
    public double obterSaldo() {
        return saldo;
    }
}
