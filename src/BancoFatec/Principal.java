package BancoFatec;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String menu;
		int op,nconta = 0;
		double valor;
		ArrayList<Conta> lista= new ArrayList<Conta>();
		// Contas
		Conta c = new Conta(new Cliente("Sirley ","119999-99999"),5000);
		Conta outra= new Conta(new Cliente("Victor","119555-5555"),1000);
		lista.add(c);
		lista.add(outra);
		lista.add(new Conta(new Cliente("Verônica", "1177777-7777"), 0));
		lista.add(new Conta(new Cliente("Carlinhos", "1199999-9999"), 0));
		lista.add(new Conta(new Cliente("Rodiney", "1188888-8888"), 0));
		lista.add(new Conta(new Cliente("Sheila", "1166666-6666"), 0));
		Conta d= new Conta(new Cliente("Verônica", "1177777-7777"),0);
		// Vamos sempre manipular Contas c e outra
		menu = "\n 1.Depositar \n 2.Sacar \n 3.Transferir \n 4.Listar \n 5.Criar nova conta \n 6. Alterar conta \n 0.sair \n Digite a opção desejada:";
		do {
			System.out.println(menu);
			op = entrada.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Saldo atual: "+c.getSaldo());
				System.out.println("Digite um valor a ser depositado: ");
				valor = entrada.nextDouble();
				entrada.nextLine(); // Consumir o caractere de nova linha
				if(c.depositar(valor)) {
					System.out.println("Valor depositado com sucesso! \nValor depositado:  "+valor+"\nSaldo atual: "+c.getSaldo());
				}else System.out.println("Depósito invalidado!");
				break;
			}
			case 2: {
				System.out.println("Insira o valor a ser sacado: ");
				valor = entrada.nextDouble();
				entrada.nextLine(); // Consumir o caractere de nova linha
				if (c.sacar(valor)){
					System.out.println("Saque Efetuado.");
				}else{
					System.out.println("Erro no Saque.");
				}
				break;
			}
			case 3: {
				System.out.println("Insira o valor a ser transferido: ");
				valor = entrada.nextDouble();
				entrada.nextLine(); // Consumir o caractere de nova linha
				if (c.transferir(valor, outra)) {
					System.out.println("Transferência efetuada com sucesso!");
				} else {
					System.out.println("Operação não realizada!");
				}
				break;
			}
			case 4: {
				for(Conta ct:lista) {
					System.out.println(ct);
				}
				break;
			}
			case 5:{
				String nome, celular;
				System.out.println("Informe seu nome:");
				nome = entrada.nextLine();
				System.out.println("Informe seu número de Celular:");
				celular = entrada.nextLine(); // Alterado para nextLine()
				System.out.println("Informe saldo:");
				double saldo = entrada.nextDouble();
				entrada.nextLine(); // Consumir o caractere de nova linha
				Conta c2 = new Conta(new Cliente(nome, celular), saldo);
				lista.add(c2);
				System.out.println("BancoFatec.Conta criada com sucesso!");
				break;
			}
			case 6:{
				// Solicitar o número da nova conta a ser manipulada
				System.out.println("Digite o número da conta, se não souber, digite -1 para sair, verifique no menu listar e retorne para esta operação");
				nconta= entrada.nextInt();
				// verifica se número da conta é válido
				if ((nconta<0)||(nconta>lista.size())) break;
				c=lista.get(nconta-1);
				System.out.println(" BancoFatec.Conta de acesso: "+ c);
				break;
			}
			case 0: {
				System.out.println("Saindo...");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
				// ou System.out.println("Opção inválida!\nRetornando ao menu.\n");
			}
		} while (op != 0);
	}
}