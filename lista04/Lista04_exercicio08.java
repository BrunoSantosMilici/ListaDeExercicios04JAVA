package lista04;

import java.util.Scanner;

public class Lista04_exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor:");
		int valor2 = sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor2);
		} else {
			System.out.println("O maior valor é: " + valor2);
			System.out.println("O menor valor é: " + valor1);
		}
		
	}

}
//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.