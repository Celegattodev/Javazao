package TratamentoErro;

import java.util.Scanner;

public class Erros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        try {
            System.out.println("Digite um número inteiro: ");
            n = entrada.nextInt();
            System.out.println("Você digitou "+n);
        } catch(Exception e) {
            System.out.println("Você não digitou um número inteiro!\n"+e.getMessage());
            System.out.println("Mensagen: "+e.getMessage());
            System.out.println("Classe: "+e.getClass());
            //e.printStackTrace();
        } finally {
            System.out.println("Bloco finally");
        }
    }
}
