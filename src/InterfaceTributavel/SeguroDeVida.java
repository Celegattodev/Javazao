package InterfaceTributavel;

public class SeguroDeVida implements Tributavel{
    private double valor;

    @Override
    public double calcularTributos() {
        return 42;
    }

    public SeguroDeVida(double valor) {
        this.valor = valor;
    }
}
