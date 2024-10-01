package BancoFatecAbstract;

public class Main{
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Murilo Celegatto", 1000);
        ContaLimite conta2 = new ContaLimite("Matheus Santos", 300);

        conta1.sacar(300);
        conta1.transferir(500, conta2);
        conta2.transferir(550, conta1);
        conta1.sacar(800);
    }
}

