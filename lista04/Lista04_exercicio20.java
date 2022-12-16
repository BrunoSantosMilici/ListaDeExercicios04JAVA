package lista04;

import java.util.Scanner;

public class Lista04_exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nome do time 1");
		String Time1 = sc.next();
		System.out.println("Nome do time 2");
		String Time2 = sc.next();
		
		System.out.println("Número de gols marcados por " + Time1);
		int gol1 =sc.nextInt();
		System.out.println("Número de gols marcados por " + Time2);
		int gol2 =sc.nextInt();
		
		if (gol1>gol2) {
			System.out.println(Time1 + " VENCEU A PARTIDA COM " + gol1);
		} else if (gol2>gol1) {
			System.out.println(Time2 + " VENCEU A PARTIDA COM " + gol2);
		} 
		if (gol1 == gol2) {
			System.out.println("Houve um EMPATE");
		}
	}

}//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
