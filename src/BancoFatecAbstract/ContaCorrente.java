package BancoFatecAbstract;

public class ContaCorrente extends Conta {

    //CONSTRUTOR
    public ContaCorrente(String titular, double saldo) {
        this.nConta++;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo && valor >= 0) {
            this.saldo -= valor;
            System.out.println("Saque Efetuado com Sucesso");
            return true;
        } else{
            System.out.println("Erro no Saque");
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("Depósito Efetuado com Sucesso");
            return true;
        } else {
            System.out.println("Erro no Depósito");
            return false;
        }
    }

    public boolean transferir(double valor, Conta outra) {
        if (sacar(valor)) {
            outra.depositar(valor);
            System.out.println("Transferência Efetuado com Sucesso");
            return true;
        } else {
            System.out.println("Erro no Transferência");
            return false;
        }
    }
}