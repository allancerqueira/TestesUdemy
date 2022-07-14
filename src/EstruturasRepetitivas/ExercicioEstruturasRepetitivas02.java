package EstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivas02 {

	public static void main(String[] args) {
		
		System.out.println("Digite duas coordenadas");
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x !=0 || y !=0) {
			
			if (x >0 && y > 0) {
				System.out.println("Seu número está no primeiro quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Seu número está no segundo quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Seu número está no terceiro quadrante");
			}
			else {
				System.out.println("Seu número está no quarto quadrante");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		
		
		
		sc.close();
	}
	
}
