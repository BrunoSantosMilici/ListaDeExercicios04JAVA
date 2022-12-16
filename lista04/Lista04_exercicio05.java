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
			System.out.println("Sua média:" + media);
			System.out.println("você foi aprovado(a)");
		} else {
			System.out.println("Sua média:" + media);
			System.out.println("você foi reprovado(a)");
		}
		
	}

}
// Calcular  a  média aritmética  simples  e  escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.