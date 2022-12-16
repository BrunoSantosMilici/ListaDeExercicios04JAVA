package lista04;

import java.util.Scanner;

public class Lista04_exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		float precoMor = 0;
		float precoMac = 0;
		
		System.out.println("Quantos morangos foram comprados?");
		int quantMor = sc.nextInt();
		System.out.println("Quantas maças foram compradas?");
		int quantMac = sc.nextInt();
		
		int soma = quantMor + quantMac;
		
		if (quantMor <= 5) {
			precoMor = (float) (quantMor * 2.50);
		} else {
			precoMor = (float) (quantMor * 2.20);
			}
			
		if (quantMac <= 5) {
			precoMac = (float) (quantMac * 1.80);
		} else {
			precoMac = (float) (quantMac * 1.50);
		}
		
		float valorT = precoMac + precoMor;
		
		if (soma < 8 || valorT >25) {
			float desconto = (float) (0.10 * valorT);
			valorT -= desconto; 
		}
		System.out.println("O valor total é: " + valorT + " R$");
		}
		
	}


