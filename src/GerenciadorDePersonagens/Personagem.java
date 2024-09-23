package GerenciadorDePersonagens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Personagem {

    //ATRIBUTOS
    private static int totalPersonagens = 0;
    private int id;
    private String nome;
    private int vida;
    private boolean vivo = true;
    private Classe classe;
    private int nivel;
    private Arma arma;
    private List<String> inventario;
    private int For;
    private int Des;
    private int Con;
    private int Int;
    private int Sab;
    private int Car;

    //ENUMS
    public enum Classe {
        Artificer, Barbaro, Bardo, Bruxo, Clerigo, Druida, Feiticeiro, Guerreiro, Ladino, Mago, Monge, Patrulheiro, Paladino
    }

    public enum Arma {
        Espada, Machado, Adaga, Cajado, Arco, Besta, Rapieira, Martelo, Lanca
    }

    public enum Atributo {
        FOR, DES, CON, INT, SAB, CAR
    }

    //CONSTRUTOR
    public Personagem(String nome, int vida, boolean vivo, Classe classe, int nivel, Arma arma, int For, int Des, int Con, int Int, int Sab, int Car) {
        this.id = ++totalPersonagens;
        this.nome = nome;
        this.vida = vida;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
        this.For = For;
        this.Des = Des;
        this.Con = Con;
        this.Int = Int;
        this.Sab = Sab;
        this.Car = Car;
        this.inventario = new ArrayList<>();
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Personagem" +
                "\nid = " + id +
                "\nnome = " + nome +
                "\nvida = " + vida +
                "\nvivo = " + vivo +
                "\nclasse = " + classe +
                "\nnível = " + nivel +
                "\narma = " + arma +
                "\natributos = " + Atributo.FOR + "\t" + Atributo.DES + "\t" + Atributo.CON + "\t" + Atributo.INT + "\t" + Atributo.SAB + "\t" + Atributo.CAR + "\n";
    }

    //MAPEAMENTOS POR CLASSE
    public static final Map<Classe, Integer> bonusVidaPorClasse = new HashMap<>();
    public static final Map<Classe, Integer> danoFixoPorClasse = new HashMap<>();

    static {
        // Bônus de vida
        bonusVidaPorClasse.put(Classe.Barbaro, 12);
        bonusVidaPorClasse.put(Classe.Guerreiro, 10);
        bonusVidaPorClasse.put(Classe.Paladino, 10);
        bonusVidaPorClasse.put(Classe.Patrulheiro, 10);
        bonusVidaPorClasse.put(Classe.Ladino, 8);
        bonusVidaPorClasse.put(Classe.Monge, 8);
        bonusVidaPorClasse.put(Classe.Artificer, 6);
        bonusVidaPorClasse.put(Classe.Bardo, 6);
        bonusVidaPorClasse.put(Classe.Clerigo, 6);
        bonusVidaPorClasse.put(Classe.Druida, 6);
        bonusVidaPorClasse.put(Classe.Feiticeiro, 6);
        bonusVidaPorClasse.put(Classe.Bruxo, 6);
        bonusVidaPorClasse.put(Classe.Mago, 6);

        // Dano fixo
        danoFixoPorClasse.put(Classe.Barbaro, 10);
        danoFixoPorClasse.put(Classe.Guerreiro, 8);
        danoFixoPorClasse.put(Classe.Paladino, 7);
        danoFixoPorClasse.put(Classe.Patrulheiro, 6);
        danoFixoPorClasse.put(Classe.Ladino, 5);
        danoFixoPorClasse.put(Classe.Monge, 4);
        danoFixoPorClasse.put(Classe.Artificer, 3);
        danoFixoPorClasse.put(Classe.Bardo, 3);
        danoFixoPorClasse.put(Classe.Clerigo, 2);
        danoFixoPorClasse.put(Classe.Druida, 2);
        danoFixoPorClasse.put(Classe.Feiticeiro, 2);
        danoFixoPorClasse.put(Classe.Bruxo, 2);
        danoFixoPorClasse.put(Classe.Mago, 2);
    }


    //EQUALS E HASHCODE (COMPARAÇÃO PELO NOME DO PERSONAGEM)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personagem personagem = (Personagem) obj;
        return nome.equals(personagem.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    //GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean getVivo() {
        return vivo;
    }

    public Classe getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getFor() {
        return For;
    }

    public void setFor(int aFor) {
        For = aFor;
    }

    public int getDes() {
        return Des;
    }

    public void setDes(int des) {
        Des = des;
    }

    public int getCon() {
        return Con;
    }

    public void setCon(int con) {
        Con = con;
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public int getSab() {
        return Sab;
    }

    public void setSab(int sab) {
        Sab = sab;
    }

    public int getCar() {
        return Car;
    }

    public void setCar(int car) {
        Car = car;
    }

    //MÉTODOS
    public static int getTotalPersonagens() {
        return totalPersonagens;
    }

    public void mostrarDetalhes() {
        System.out.println(this.toString());
    }

    public void mostrarAtributos() {
        System.out.println("Força: " + For + "\nDestreza: " + Des + "\nConstituição: " + Con + "\nInteligência: " + Int + "\nSabedoria: " + Sab + "\nCarisma: " + Car);
    }

    public void adicionarVida(int quantidade) {
        if (quantidade > 0) {
            this.vida += quantidade;
            System.out.println(quantidade + " pontos de vida adicionados. Vida atual de " + getNome() + ": " + this.vida);
            if (this.vida > 0) {
                setVivo(true);
                System.out.println(getNome() + " está vivo? " + getVivo());
            }
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void reduzirVida(int quantidade) {
        if (quantidade > 0) {
            this.vida -= quantidade;
            System.out.println(quantidade + " pontos de vida reduzidos. Vida atual de " + getNome() + ": " + this.vida);
            if (this.vida <= 0) {
                setVivo(false);
                System.out.println(getNome() + " está vivo? " + getVivo());
            }
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void ataque(int dano, Personagem alvo) {
        int danoTotal = dano + danoFixoPorClasse.getOrDefault(this.classe, 1);
        System.out.println(getNome() + " realizou um ataque com a arma " + getArma() + " contra " + alvo.getNome() + " e causou " + danoTotal + " de dano.");
        alvo.reduzirVida(danoTotal);
    }

    public void subirNivel() {
        this.nivel += 1;
        System.out.println("Parabéns! " + getNome() + " subiu para o nível " + this.nivel);

        int bonusVida = bonusVidaPorClasse.getOrDefault(this.classe, 5);
        this.vida += bonusVida;

        System.out.println("Sua vida aumentou em " + bonusVida + " Agora a vida atual de " + nome + " é de " + getVida());
    }

    public void modificarAtributo(Atributo atributo, int novoValor) {
        if (novoValor > 0  && novoValor < 21) {
            switch (atributo){
                case FOR:
                    this.For = novoValor;
                    break;
                case DES:
                    this.Des = novoValor;
                    break;
                case CON:
                    this.Con = novoValor;
                    break;
                case INT:
                    this.Int = novoValor;
                    break;
                case SAB:
                    this.Sab = novoValor;
                    break;
                case CAR:
                    this.Car = novoValor;
                    break;
            }
        } else {
            System.out.println("Novo valor inválido.\nO valor do atributo deve ser entre 1 e 20.");
        }
    }

    public void adicionarItem(String item) {
        inventario.add(item);
        System.out.println(item+" foi adicionado ao inventário de "+nome);
    }

    public void removerItem(String item) {
        if (inventario.contains(item)){
            inventario.remove(item);
            System.out.println(item+" removido do inventário de "+nome);
        } else {
            System.out.println(item + " não está consta no inventário de " +nome);
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventário de " + nome + ": " + inventario);
    }
}