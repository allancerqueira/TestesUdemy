import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto02 {
	
	public static void main(String[] args) {
		
//		Faça um programa para ler o valor do raio de um círculo,
//		e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de um raio de um círculo: ");
		
		double r = sc.nextDouble();
		double a = Math.PI * Math.pow(r, 2);
		
		System.out.printf("O valor do seu raio é %.0f e o"
				+ " valor da área do seu círculo é %.2f", r, a);
				
				
	}

}
