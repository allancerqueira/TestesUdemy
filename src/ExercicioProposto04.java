import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto04 {
	public static void main(String[] args) {
//		
//		Fazer um programa que leia o nome de um funcion�rio,
//		seu n�mero de horas trabalhadas, o valor que recebe por
//		hora e calcula o sal�rio desse funcion�rio. A seguir, mostre
//		o n�mero e o sal�rio do funcion�rio, com duas casas
//		decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcion�rio");
		String nome = sc.next();
		
		System.out.println("Digite o n�mero de horas trabalhadas");
		double horas = sc.nextDouble();
		
		System.out.println("Digite o valor da hora trabalhada");
		double valor = sc.nextDouble();
		
		double salario = horas*valor;
		
		System.out.printf("O funcion�rio %s trabalhou %.2f horas e receber�"
				+ " de sal�rio R$ %.2f reais.", nome, horas, salario);
		
		
		
		
	}

}
