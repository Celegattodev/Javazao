package InterfaceTributavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda{
    private double totalTributos;
    private List<Tributavel> tributaveis;

    public GerenciadorDeImpostoDeRenda() {
        tributaveis = new ArrayList<>();
        totalTributos = 0;
    }

    public void adicionar(Tributavel tributavel) {
        tributaveis.add(tributavel);
        totalTributos += tributavel.calcularTributos();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}