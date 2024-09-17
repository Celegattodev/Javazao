package SistemaSIRCOB;

public class Buraco {
//ATTRIBUTES
    private int id;
    private String endereco;
    private int tamanho;
    private Localizacao localizacao;
    private String bairro;
    private PrioridadeReparo prioridade;

//ENUMS
    public enum Localizacao {
        MEIODARUA, CALCADA, CANTODARUA, MEIOFIO
    }

    public enum PrioridadeReparo {
        BAIXA, ALTA
    }

//TOSTRING
    @Override
    public String toString() {
        return "SistemaSIRCOB.Buraco {\n" +
                "id=" + this.id +
                ", \nendereco= " + this.endereco +
                ", \ntamanho= " + this.tamanho +
                ", \nlocalizacao " + localizacao +
                ", \nbairro= " + this.bairro +
                ", \nprioridadeReparo= " + this.calcularPrioridade() +
                '}';
    }

//CONSTRUCTOR
    public Buraco(int id, String endereco, int tamanho, Localizacao localizacao, String bairro) {
        this.id = id;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.localizacao = localizacao;
        this.bairro = bairro;
    }

//GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public PrioridadeReparo getPrioridadeReparo() {
        return prioridade;
    }

    public void setPrioridade(PrioridadeReparo prioridade) {
        this.prioridade = prioridade;
    }

//MÉTODOS
    public PrioridadeReparo calcularPrioridade(){
        if (tamanho > 5){
            return PrioridadeReparo.ALTA;
        } else {
            return PrioridadeReparo.BAIXA;
        }
    }
}