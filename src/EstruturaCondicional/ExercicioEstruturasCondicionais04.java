package EstruturaCondicional;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais04 {
	
	public static void main(String[] args) {
		
//		Leia a hora inicial e a hora final de um jogo. 
//		A seguir calcule a duração do jogo, sabendo que
//		o mesmo pode começar em um dia e terminar em outro, 
//		tendo uma duração mínima de 1 hora e máxima de 24 horas
		
		System.out.println("Digite a hora inicial e a hora"
				+ "final de uma partida de xadrez");
		
		Scanner sc = new Scanner (System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int resultado;
		
		if ( horaInicio < horaFim) {
			resultado = horaFim - horaInicio;
		}
		else {
			resultado = 24 - horaInicio + horaFim;
		}
		
		System.out.printf("O jogo teve a duração de %d horas", resultado);
		
		
		
		
		sc.close();
		
	}

}
