package lista04;

import java.util.Scanner;

public class Lista04_exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maior = 0;
		
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor3 = sc.nextInt();
		
		if (valor1 > valor2) {
			maior = valor1;
		} else {
			maior = valor2;
		}
		if (valor3>maior) {
			System.out.println("O maior valor é: " + valor3);
		} else {
			System.out.println("O maior valor é: " + maior);
		}
	}

}
//ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles