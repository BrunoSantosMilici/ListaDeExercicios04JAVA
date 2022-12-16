package lista04;

import java.util.Scanner;

public class Lista04_exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número");
		int numero1 = sc.nextInt();
		System.out.println("Digite um número");
		int numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Os números são iguais");
		} else if (numero1 > numero2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}
		
	}

}
//Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro
