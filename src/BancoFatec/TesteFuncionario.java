package BancoFatec;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Sirley", "123.456.789-55", 5000);
        Gerente g = new Gerente("Pietro", "987654321-54", 5000, 123321);

        System.out.println(f);
        System.out.println("Bonificação do funcionário: R$"+f.bonificacao());
        System.out.println(g);
        System.out.println("Bonificação do gerente: R$"+g.bonificacao());
    }
}