package EstruturaCondicional;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais03 {

	public static void main(String[] args) {

		System.out.println("Digite dois n�meros inteiros");

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A ==0) {
			System.out.println("Os n�meros s�o m�ltiplos");
		}
		else {
			System.out.println("Os n�meros n�o s�o m�ltiplos");
		}
		
		sc.close();

	}
}
