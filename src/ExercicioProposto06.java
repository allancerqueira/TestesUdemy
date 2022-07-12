import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto06 {
	
	public static void main(String[] args) {
		
//		Fazer um programa que leia três valores com ponto flutuante de
//		dupla precisão: A, B e C. Em seguida, calcule e
//		mostre:
//		a) a área do triângulo retângulo que tem A por base e C por altura.
//		b) a área do círculo de raio C. (pi = 3.14159)
//		c) a área do trapézio que tem A e B por bases e C por altura.
//		d) a área do quadrado que tem lado B.
//		e) a área do retângulo que tem lados A e B
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores decimais: (A,B,C)");
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double RA = (A*C)/2;
		double RB = Math.PI * Math.pow(C, 2);
		double RC = ((A+B)*C)/2;
		double RD = Math.pow(C, 2);
		double RE = A*B;
		
		System.out.println("a)A área do triângulo retângulo que tem A "
				+ "por base e C por altura");
		System.out.printf("Resposta: A área do triângulo é %.2f%n",RA );
		System.out.println("**************************************"
				+ "*****************************");
		
		
		System.out.println("B)A área do círculo de raio C ");
		System.out.printf("Resposta: A área do CÍRCULO é %.2f%n",RB);
		System.out.println();
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("C)A área do trapézio que tem A e B por bases e C por altura");
		System.out.printf("Resposta: A área do trapézio é %.2f%n",RC);
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("D)área do quadrado que tem lado B");
		System.out.printf("Resposta: A área do quadrado é %.2f%n",RD);
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("E)área do retângulo que tem lados A e B");
		System.out.printf("Resposta: A área do retângulo é %.2f%n",RE);
		
		
		
		
		
		
		
				
	}

}
