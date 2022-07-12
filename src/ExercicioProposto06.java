import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto06 {
	
	public static void main(String[] args) {
		
//		Fazer um programa que leia tr�s valores com ponto flutuante de
//		dupla precis�o: A, B e C. Em seguida, calcule e
//		mostre:
//		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
//		b) a �rea do c�rculo de raio C. (pi = 3.14159)
//		c) a �rea do trap�zio que tem A e B por bases e C por altura.
//		d) a �rea do quadrado que tem lado B.
//		e) a �rea do ret�ngulo que tem lados A e B
		
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
		
		System.out.println("a)A �rea do tri�ngulo ret�ngulo que tem A "
				+ "por base e C por altura");
		System.out.printf("Resposta: A �rea do tri�ngulo � %.2f%n",RA );
		System.out.println("**************************************"
				+ "*****************************");
		
		
		System.out.println("B)A �rea do c�rculo de raio C ");
		System.out.printf("Resposta: A �rea do C�RCULO � %.2f%n",RB);
		System.out.println();
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("C)A �rea do trap�zio que tem A e B por bases e C por altura");
		System.out.printf("Resposta: A �rea do trap�zio � %.2f%n",RC);
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("D)�rea do quadrado que tem lado B");
		System.out.printf("Resposta: A �rea do quadrado � %.2f%n",RD);
		System.out.println("**************************************"
				+ "*****************************");
		
		System.out.println("E)�rea do ret�ngulo que tem lados A e B");
		System.out.printf("Resposta: A �rea do ret�ngulo � %.2f%n",RE);
		
		
		
		
		
		
		
				
	}

}
