package BancoFatecAbstract;

public abstract class Conta {
    //ATRIBUTOS
    protected static int nConta;
    protected String titular;
    protected double saldo;

    //MÉTODOS ABSTRATOS
    public abstract boolean sacar(double valor);

    public abstract boolean depositar(double valor);

    public abstract boolean transferir(double valor, Conta outra);

    //TOSTRING
    @Override
    public String toString() {
        return "Conta [nConta=" + nConta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }

    //GETTERS E SETTERS
    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
