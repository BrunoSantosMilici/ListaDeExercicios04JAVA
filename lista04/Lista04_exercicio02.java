package lista04;

import java.util.Scanner;

public class Lista04_exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if (valor>10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("É MENOR QUE 10!");
		}
	}

}
// Algoritmo que fala de um número é maior ou menor que 10