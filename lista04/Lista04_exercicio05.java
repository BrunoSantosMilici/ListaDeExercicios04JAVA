package lista04;

import java.util.Scanner;

public class Lista04_exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota:");
		int nota2 = sc.nextInt();
		
		float media = (nota1 + nota2) / 2;
		
		if (media>6) {
			System.out.println("Sua m�dia:" + media);
			System.out.println("voc� foi aprovado(a)");
		} else {
			System.out.println("Sua m�dia:" + media);
			System.out.println("voc� foi reprovado(a)");
		}
		
	}

}
// Calcular  a  m�dia aritm�tica  simples  e  escrever uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever tamb�m a m�dia calculada.