import java.util.Scanner;

public class ExercicioProposto01 {

	public static void main(String[] args) {

//		Faça um programa para ler dois valores inteiros,
//		e depois mostrar na tela a soma desses números com uma
//		mensagem explicativa, conforme exemplos.

		System.out.println("Digite dois valores inteiros: ");

		Scanner sc = new Scanner(System.in);

		int V1 = sc.nextInt();
		int V2 = sc.nextInt();

		int V3;
		V3 = V1 + V2;

		System.out.printf("Você digitou os valores %d e %d, a soma dos valores" + " digitados é %d", V1, V2, V3);

	}

}
