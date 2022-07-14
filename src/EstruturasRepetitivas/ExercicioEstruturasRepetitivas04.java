package EstruturasRepetitivas;

import java.util.Iterator;
import java.util.Scanner;

public class ExercicioEstruturasRepetitivas04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int variavel = sc.nextInt();
		
		for (int i=1; i<=variavel; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		

		
		
		
		
		
		sc.close();
	}

}
