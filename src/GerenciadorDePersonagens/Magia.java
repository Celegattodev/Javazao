package GerenciadorDePersonagens;

public class Magia {
//ATRIBUTOS
    private int nivel;
    private String escola;
    private String nome;
    private TempoConjuracao tempoConjuracao;
    private String alcance;
    private String duracao;
    private String componentes;
    private boolean ritual;

//ENUMS
    public enum TempoConjuracao {
        ACAO, REACAO, ACAOBONUS, UMARODADA, UMMINUTO, DEZMINUTOS, UMDIA, DEZDIAS
    }
}
