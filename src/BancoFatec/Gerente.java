package BancoFatec;

public class Gerente extends Funcionario {

    private int senha;
    private int nFuncionarioGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.nFuncionarioGerenciados = getnFuncionarioGerenciados();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setnFuncionarioGerenciados(int nFuncionarioGerenciados) {
        this.nFuncionarioGerenciados = nFuncionarioGerenciados;
    }

    public int getnFuncionarioGerenciados() {
        return nFuncionarioGerenciados;
    }

    @Override
    public String toString() {
        return super.toString()+"BancoFatec.Gerente [nFuncionariosGerenciados = "+nFuncionarioGerenciados;
    }

    @Override
    public double bonificacao() {
        return this.salario *= 1.05;
    }
}
