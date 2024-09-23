package GerenciadorDePersonagens;

public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem("Travok", 100, true, Personagem.Classe.Barbaro, 15, Personagem.Arma.Machado, 18, 16, 18, 10, 12, 14);
        Personagem heroi2 = new Personagem("Travok", 70, true, Personagem.Classe.Ladino, 10, Personagem.Arma.Arco, 10, 20, 14, 16, 12, 18);

        heroi1.adicionarItem("Elmo");
        heroi1.adicionarItem("Capa");
        heroi1.mostrarInventario();
        heroi1.removerItem("Elmo");
        heroi1.mostrarInventario();
    }
}
