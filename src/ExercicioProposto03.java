import java.util.Scanner;

public class ExercicioProposto03 {
	
	public static void main(String[] args) {
		
//		Fazer um programa para ler quatro valores inteiros
//		A, B, C e D. A seguir, calcule e mostre a diferen�a do 
//		produto de A e B pelo produto de C e D segundo a f�rmula: 
//		DIFERENCA = (A * B - C * D).
		
		System.out.println("Digite 04 valores inteiros: ");
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int dif = (A*B - C*D);
		
		System.out.printf("A diferen�a da multiplica��o dos dois primeiros valores"
				+ " menos a multiplica��o dos dois �ltimos valores � de %d.", dif);
		
		
	}

}
