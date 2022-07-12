import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto04 {
	public static void main(String[] args) {
//		
//		Fazer um programa que leia o nome de um funcionário,
//		seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre
//		o número e o salário do funcionário, com duas casas
//		decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário");
		String nome = sc.next();
		
		System.out.println("Digite o número de horas trabalhadas");
		double horas = sc.nextDouble();
		
		System.out.println("Digite o valor da hora trabalhada");
		double valor = sc.nextDouble();
		
		double salario = horas*valor;
		
		System.out.printf("O funcionário %s trabalhou %.2f horas e receberá"
				+ " de salário R$ %.2f reais.", nome, horas, salario);
		
		
		
		
	}

}
