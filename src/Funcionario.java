public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double bonificacao(){
        return this.salario *= 1.01;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Funcionario [Nome= "+nome+", CPF = "+cpf+", Salário = "+salario;
    }
}