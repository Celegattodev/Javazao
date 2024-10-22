package InterfaceAreaCalculavel;

public class Quadrado implements AreaCalculavel{
    private double lado;

    @Override
    public double calculaArea() {
        return lado*lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
}