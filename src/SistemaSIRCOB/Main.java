package SistemaSIRCOB;

public class Main {
    private static Buraco buraco1;

    public static void main(String[] args) {
        // Inicializando o buraco1
        buraco1 = new Buraco(
                101,
                "Rua A",
                7,
                Buraco.Localizacao.CALCADA,
                "Centro"
        );

        // Criando uma ordem de trabalho
        OrdemDeTrabalho ordem1 = new OrdemDeTrabalho(
                buraco1,
                1,  // Removi o zero à esquerda
                5,
                "Pá Carregadeira, Compactador de Asfalto, Pavimentadora de Asfalto",
                24,
                OrdemDeTrabalho.Status.CONCLUIDO,
                20
        );

        // Exibindo os dados do buraco
        System.out.println(buraco1);
    }
}
