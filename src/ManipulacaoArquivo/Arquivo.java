package ManipulacaoArquivo;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public static void gravar (ArrayList<String> lista, String nomedoarquivo) throws IOException {
        FileWriter arq = new FileWriter(nomedoarquivo); //Cria objeto do tipo arquivo
        PrintWriter gravarArq = new PrintWriter(arq); //Habilita arquivo oara ser gravado

        for (String nome:lista){ // Percorre a lista e grava no arquivo
            gravarArq.println(nome);
        }
    gravarArq.close(); // Fecha o arquivo
    }

    public static void importar (String nomearquivo, ArrayList<String> lista) throws IOException{
        FileReader arq = new FileReader(nomearquivo); //Objeto do tipo arquivo para leitura
        BufferedReader lerArq = new BufferedReader(arq); //Buffer para leitura
        String linha = lerArq.readLine(); // Lê a primeira linha

        while (linha!=null){ //A variável "linha" recebe o valor "null" quando o processo de repetição atingir o final do arquivo texto

            lista.add(linha);
            linha = lerArq.readLine(); // Lê da segunda até a última linha do arq
        }
        arq.close(); // Fecha arquivo
    }

    public static void main(String[] args) {
        /*ArrayList<String> bandas = new ArrayList<String>();
        bandas.add("Nirvana");
        bandas.add("AC/DC");
        bandas.add("Metallica");
        bandas.add("Forroboys");
        bandas.add("Artic Monkeys");
        try {
            gravar(bandas, "C:\\Users\\FATEC ZONA LESTE\\Documents\\SÓ AS MELHORES 2024.TXT");
            System.out.println("Gravação finalizada.");
        } catch (IOException e) {
            System.out.println("Erro na gravação de arquivo.");
        }*/

        ArrayList<String> compras = new ArrayList<String>();
        try {
            importar("C:\\Users\\FATEC ZONA LESTE\\Documents\\Lista de Compra", compras);
            System.out.println(compras);
            System.out.println("Leitura realizada.");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo.");
        }
    }
}