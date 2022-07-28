package applicationPagamento;

import java.util.Locale;
import java.util.Scanner;

import EntitiesPagamento.Pagamento;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Pagamento pagamento = new Pagamento ();
		
		System.out.println("Digite as informa��es de um funcion�rio: ");
		System.out.print("nome: ");
		pagamento.name = sc.next();
		
		System.out.print("sal�rio bruto: ");
		pagamento.grossSalary = sc.nextDouble();
		
		System.out.print("% de imposto: ");
		pagamento.tax = sc.nextDouble();
		
		System.out.println(pagamento);
		
		System.out.println("Digite o valor do aumento: ");
		
		double increase = sc.nextDouble();
		pagamento.increaseSalary(increase);
		
		System.out.println("Os valores atualizados s�o de" + pagamento);
		
		
		
		sc.close();
		
	}

}
