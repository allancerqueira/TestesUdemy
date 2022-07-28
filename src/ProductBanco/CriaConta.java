package ProductBanco;

import java.util.Locale;
import java.util.Scanner;

import EntitiesBanco.Conta;

public class CriaConta {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Crie uma conta no banco:");
		
		System.out.print("Digite o nome de cliente: ");
		String nomeCliente = sc.next();
		
		System.out.print("Digite o n�mero do cliente: ");
		int numeroCliente = sc.nextInt();
		
		System.out.print("Digite o valor do dep�sito inicial: ");
		double valorInicial = sc.nextDouble();
		
		Conta conta = new Conta(nomeCliente, numeroCliente, valorInicial);
		
		//System.out.println(conta);
		
		System.out.println("Fa�a um dep�sito: ");
		double deposito = sc.nextDouble();
		
		conta.deposito(deposito);
		
		System.out.println("Fa�a um saque: ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		
		System.out.printf("O valor do seu novo saldo � de R$ %.2f", conta.getSaldo());
		
		
		


		
	
		
		
		
		
		
		
		
		sc.close();
	}

}
