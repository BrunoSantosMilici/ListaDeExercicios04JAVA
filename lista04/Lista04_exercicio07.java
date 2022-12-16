package lista04;

import java.util.Scanner;

public class Lista04_exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println("O maior número é: " + valor1);
		} else {
			System.out.println("O maior número é: " + valor2);
		}
		
		

	}

}
// Algoritmo que diz qual é o maior valor