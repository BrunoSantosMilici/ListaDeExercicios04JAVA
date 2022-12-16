package lista04;

import java.util.Scanner;

public class Lista04_exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float pesoIdeal = 0;
		
		System.out.println("Digite o seu nome");
		String nome = sc.next();
		
		System.out.println("Digite sua altura");
		float altura = sc.nextFloat();
		
		System.out.println("Digite seu Sexo (F ou M)");
		String sexo = sc.next();
		
		if (sexo.equals("M")) {
			pesoIdeal = (float) ((72.2 * altura) - 52);
		} else {
		if (sexo.equals("F")) {
			pesoIdeal = (float) ((62.1 * altura) - 44.7);
		} else {
			System.out.println("Por favor, digite M ou F em 'Sexo'");
		}
			}
		System.out.println(nome + " o seu peso ideal é: " + pesoIdeal + " Kg");
	}

}
//Calculador de peso ideal