package lista04;

import java.util.Scanner;

public class Lista04_exercicio19 {
	public static void main(String [] arg) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Digite um lado do triângulo");
	float lado1 = sc.nextFloat();
	System.out.println("Digite o segundo lado");
	float lado2 = sc.nextFloat();
	System.out.println("Digite o último lado");
	float lado3 = sc.nextFloat();
	
	if(lado1> (lado2 + lado3)) {
		System.out.println("Não é triângulo");
		} else {
			if(lado2 > (lado1 + lado3)) {
				System.out.println("Não é triângulo");
				} else {
					if(lado3 > (lado2 + lado1)) {
						System.out.println("Não é triângulo");}
					else {
						System.out.println("Temos um triângulo");
					}
				}
		}
	}

}
//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.