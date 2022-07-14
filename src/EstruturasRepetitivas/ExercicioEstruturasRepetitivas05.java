package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivas05 {

	public static void main(String[] args) {

//		Leia um valor inteiro N. Este valor será a quantidade de valores
//		inteiros X que serão lidos em seguida. Mostre quantos destes valores 
//		X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
//		mostrando essas informações conforme exemplo (use a palavra "in" para 
//	    dentro do intervalo, e "out" para fora do intervalo).

		Scanner sc = new Scanner(System.in);

		int repeticoes = sc.nextInt();
		int valores;
		int dentro = 0;
		int fora = 0;

		for (int i = 1; i <=repeticoes; i++) {
			valores = sc.nextInt();
			if (valores >= 10 && valores <= 20) {
				dentro += 1;
			} else {
				fora += 1;
			}

		}
		System.out.printf("você digitou %d número(s) %n", repeticoes);
		System.out.printf("%d número(s) dentro do intervalo de 10 e 20 %n", dentro);
		System.out.printf("%d número(s) fora do intervalo de 10 e 20 %n", fora);
	}

}
