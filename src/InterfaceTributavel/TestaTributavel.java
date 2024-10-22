package InterfaceTributavel;

public class TestaTributavel {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaCorrente conta2 = new ContaCorrente(2000);
        SeguroDeVida seguro1 = new SeguroDeVida(500);

        gerenciador.adicionar(conta1);
        gerenciador.adicionar(conta2);
        gerenciador.adicionar(seguro1);

        System.out.println("Total de tributos: " + gerenciador.getTotalTributos());
    }
}
