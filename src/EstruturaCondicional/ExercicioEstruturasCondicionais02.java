package EstruturaCondicional;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais02 {
	
	public static void main(String[] args) {
		
		System.out.println("Digite um valor inteiro");
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("O número digitado é par");
		}
		else {
			System.out.println("O número digitado é ímpar");
		}
		
		sc.close();
		
	}

}
