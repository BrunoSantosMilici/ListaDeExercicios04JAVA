package lista04;

import java.util.Scanner;

public class Lista04_exercicio19 {
	public static void main(String [] arg) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Digite um lado do tri�ngulo");
	float lado1 = sc.nextFloat();
	System.out.println("Digite o segundo lado");
	float lado2 = sc.nextFloat();
	System.out.println("Digite o �ltimo lado");
	float lado3 = sc.nextFloat();
	
	if(lado1> (lado2 + lado3)) {
		System.out.println("N�o � tri�ngulo");
		} else {
			if(lado2 > (lado1 + lado3)) {
				System.out.println("N�o � tri�ngulo");
				} else {
					if(lado3 > (lado2 + lado1)) {
						System.out.println("N�o � tri�ngulo");}
					else {
						System.out.println("Temos um tri�ngulo");
					}
				}
		}
	}

}
//Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.