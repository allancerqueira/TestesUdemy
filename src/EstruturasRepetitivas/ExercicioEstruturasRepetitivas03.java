package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivas03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (codigo != 4) {

			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else {
				diesel += 1;
			}

			codigo = sc.nextInt();
		}
		System.out.println("Fim da contagem");
		System.out.printf("Álccol foi votado %d vezes %n", alcool);
		System.out.printf("Gasolina foi votado %d vezes %n", gasolina);
		System.out.printf("Diesel foi votado %d vezes %n", diesel);

		sc.close();

	}

}
