package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturasCondicionais05 {

	public static void main(String[] args) {

		System.out
				.println("Digite o código de um sanduíche, em seguida digite" + " a quantida de sanduíches desejados.");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;

		if (codigo == 1) {
			total = quantidade * 4;
			System.out.printf("Seu sanduíche é um Cachorro Quente e você" + " irá pagar R$ %.2f por %d sanduíche(s).",
					total, quantidade);
		} 
		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Seu sanduíche é um X-Salada e você" + " irá pagar R$ %.2f por %d sanduíche(s).", total,
					quantidade);
		} 
		else if (codigo == 3) {
			total = quantidade * 5;
			System.out.printf("Seu sanduíche é uma X-Bacon e você" + " irá pagar R$ %.2f por %d sanduíche(s).", total,
					quantidade);
		}
		else if (codigo == 4) {
			total = quantidade * 2;
			System.out.printf("Seu sanduíche é uma torrada" + " irá pagar R$ %.2f por %d sanduíche(s).", total,
					quantidade);
		}
		else  {
			total = quantidade * 1;
			System.out.printf("Seu pedido é um refri e você" + " irá pagar R$ %.2f por %d refri(s).", total,
					quantidade);
		}

		sc.close();
	}

}
