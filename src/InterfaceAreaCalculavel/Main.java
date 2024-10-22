package InterfaceAreaCalculavel;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        Retangulo r1 = new Retangulo(5, 10);
        Quadrado q1 = new Quadrado(9);

        System.out.println(c1.calculaArea());
        System.out.println(r1.calculaArea());
        System.out.println(q1.calculaArea());
    }
}
