import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto02 {
	
	public static void main(String[] args) {
		
//		Fa�a um programa para ler o valor do raio de um c�rculo,
//		e depois mostrar o valor da �rea deste c�rculo com quatro
//		casas decimais conforme exemplos.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de um raio de um c�rculo: ");
		
		double r = sc.nextDouble();
		double a = Math.PI * Math.pow(r, 2);
		
		System.out.printf("O valor do seu raio � %.0f e o"
				+ " valor da �rea do seu c�rculo � %.2f", r, a);
				
				
	}

}
