package EstruturaCondicional;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor inteiro: ");
		
		int x = sc.nextInt();
		
		if (x >0) {
			System.out.println("O n�mero digitado � positivo");
		}
		else {
			System.out.println("O n�mero digitado � negativo");
		}
		
		
		
		sc.close();
	}

}
