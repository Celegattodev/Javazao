package SistemaSIRCOB;

public class OrdemDeTrabalho {
//ATRIBUTOS
    private Buraco buraco;
    private int idEquipeReparo;
    private int tamanhoEquipe;
    private String equipamentos;
    private double horasReparo;
    private Status statusReparo;
    private double qtdMaterial;
    private double custo;

//ENUM
    public enum Status{
        CONCLUIDO, EM_ANDAMENTO, NAO_CONCLUIDO
    }
//TOSTRING
    @Override
    public String toString() {
        return "SistemaSIRCOB.OrdemDeTrabalho {" +
                "\nburaco =" + buraco +
                ", \nidEquipeReparo = " + idEquipeReparo +
                ", \ntamanhoEquipe = " + tamanhoEquipe +
                ", \nequipamentos = " + equipamentos +
                ", \nhorasReparo = " + horasReparo +
                ", \nstatusReparo = " + statusReparo +
                ", \nqtdMaterial = " + qtdMaterial +
                ", \ncusto = " + custo +
                '}';
    }
//CONSTRUTOR
    public OrdemDeTrabalho(Buraco buraco, int idEquipeReparo, int tamanhoEquipe, String equipamentos, double horasReparo, Status statusReparo, double qtdMaterial) {
        this.buraco = buraco;
        this.idEquipeReparo = idEquipeReparo;
        this.tamanhoEquipe = tamanhoEquipe;
        this.equipamentos = equipamentos;
        this.horasReparo = horasReparo;
        this.statusReparo = statusReparo;
        this.qtdMaterial = qtdMaterial;
        this.custo = calcularCustoReparo();
    }

//GETTERS E SETTERS
    public Buraco getBuraco() {
        return buraco;
    }

    public void setBuraco(Buraco buraco) {
        this.buraco = buraco;
    }

    public int getIdEquipeReparo() {
        return idEquipeReparo;
    }

    public void setIdEquipeReparo(int idEquipeReparo) {
        this.idEquipeReparo = idEquipeReparo;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public double getHorasReparo() {
        return horasReparo;
    }

    public void setHorasReparo(int horasReparo) {
        this.horasReparo = horasReparo;
    }

    public Status getStatusReparo() {
        return statusReparo;
    }

    public void setStatusReparo(Status statusReparo) {
        this.statusReparo = statusReparo;
    }

    public double getQtdMaterial() {
        return qtdMaterial;
    }

    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

//MÉTODOS
    public double calcularCustoReparo(){
        double custoHora = 60;
        double custoPessoa = 150;
        double custoMaterial = 15;
        double custoEquipamento = 250;

        this.custo = Double.parseDouble((horasReparo * custoHora +(tamanhoEquipe * custoPessoa)+(qtdMaterial * custoMaterial)+equipamentos));
        return custoHora;
    }
}

