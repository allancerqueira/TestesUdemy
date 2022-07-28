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
		
		System.out.print("Digite o número do cliente: ");
		int numeroCliente = sc.nextInt();
		
		System.out.print("Digite o valor do depósito inicial: ");
		double valorInicial = sc.nextDouble();
		
		Conta conta = new Conta(nomeCliente, numeroCliente, valorInicial);
		
		//System.out.println(conta);
		
		System.out.println("Faça um depósito: ");
		double deposito = sc.nextDouble();
		
		conta.deposito(deposito);
		
		System.out.println("Faça um saque: ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		
		System.out.printf("O valor do seu novo saldo é de R$ %.2f", conta.getSaldo());
		
		
		


		
	
		
		
		
		
		
		
		
		sc.close();
	}

}
