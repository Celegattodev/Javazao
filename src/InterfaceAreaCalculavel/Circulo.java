package InterfaceAreaCalculavel;

public class Circulo implements AreaCalculavel{
    private double raio;

    @Override
    public double calculaArea() {
        return 2*3.14*raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}
