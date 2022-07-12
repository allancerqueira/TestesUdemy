package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturasCondicionais05 {

	public static void main(String[] args) {

		System.out
				.println("Digite o c�digo de um sandu�che, em seguida digite" + " a quantida de sandu�ches desejados.");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;

		if (codigo == 1) {
			total = quantidade * 4;
			System.out.printf("Seu sandu�che � um Cachorro Quente e voc�" + " ir� pagar R$ %.2f por %d sandu�che(s).",
					total, quantidade);
		} 
		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Seu sandu�che � um X-Salada e voc�" + " ir� pagar R$ %.2f por %d sandu�che(s).", total,
					quantidade);
		} 
		else if (codigo == 3) {
			total = quantidade * 5;
			System.out.printf("Seu sandu�che � uma X-Bacon e voc�" + " ir� pagar R$ %.2f por %d sandu�che(s).", total,
					quantidade);
		}
		else if (codigo == 4) {
			total = quantidade * 2;
			System.out.printf("Seu sandu�che � uma torrada" + " ir� pagar R$ %.2f por %d sandu�che(s).", total,
					quantidade);
		}
		else  {
			total = quantidade * 1;
			System.out.printf("Seu pedido � um refri e voc�" + " ir� pagar R$ %.2f por %d refri(s).", total,
					quantidade);
		}

		sc.close();
	}

}
