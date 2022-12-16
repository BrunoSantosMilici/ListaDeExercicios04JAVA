package lista04;

import java.util.Scanner;

public class Lista04_exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Que horas a partida iniciou?");
		int inicio = sc.nextInt();
		System.out.println("Que horas a partida acabou?");
		int fim = sc.nextInt();
		
		int duracao = fim - inicio;
		
		if (duracao<=0) {
			duracao += 24;
			System.out.println("A duração da partida foi de " + duracao + " horas");
		} else {
			System.out.println("A duração da partida foi de " + duracao + " horas");
		}
	}

}
//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.