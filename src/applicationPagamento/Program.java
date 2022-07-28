package applicationPagamento;

import java.util.Locale;
import java.util.Scanner;

import EntitiesPagamento.Pagamento;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Pagamento pagamento = new Pagamento ();
		
		System.out.println("Digite as informações de um funcionário: ");
		System.out.print("nome: ");
		pagamento.name = sc.next();
		
		System.out.print("salário bruto: ");
		pagamento.grossSalary = sc.nextDouble();
		
		System.out.print("% de imposto: ");
		pagamento.tax = sc.nextDouble();
		
		System.out.println(pagamento);
		
		System.out.println("Digite o valor do aumento: ");
		
		double increase = sc.nextDouble();
		pagamento.increaseSalary(increase);
		
		System.out.println("Os valores atualizados são de" + pagamento);
		
		
		
		sc.close();
		
	}

}
