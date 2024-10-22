package InterfaceAreaCalculavel;

public class Retangulo implements AreaCalculavel{
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return (altura*base)/2;
    }
}
