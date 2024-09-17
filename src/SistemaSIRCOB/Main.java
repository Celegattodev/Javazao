package SistemaSIRCOB;

public class Main {
    private static Buraco buraco1;

    public static void main(String[] args) {
        OrdemDeTrabalho Ordem1 = new OrdemDeTrabalho(Buraco buraco1 = new Buraco(
                101,
                "Rua A",
                7,
                Buraco.Localizacao.CALCADA,
                "Centro"
        ), 001, 5, "Pá Carregadeira, Compactador de Asfalto, Pavimentadora de Asfalto", 24, OrdemDeTrabalho.Status.CONCLUIDO, 20);
        System.out.println(buraco1);
    }
}