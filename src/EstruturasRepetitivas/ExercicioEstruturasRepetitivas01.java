package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivas01 {

	public static void main(String[] args) {

		System.out.println("Digite uma valor de 4 dígitos");

		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida, tente novamente");
			senha = sc.nextInt();
		}
		
		System.out.println("Senha correta");

		sc.close();
	}

}
