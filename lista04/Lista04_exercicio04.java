package lista04;

import java.util.Scanner;

public class Lista04_exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float preco = 0;
		
		System.out.println("Quantas ma�as foram compradas?");
		int macas = sc.nextInt();
		 if (macas>=12) {
			preco = macas;
		} else {
			preco = (float) (macas * 1.30);
		}
		 	System.out.println("O valor da compra � de: " + preco );
	}

}
//um  programa  que  leia  o  n�mero  de  ma��s  compradas,  calcule  e escreva o custo total da compra
//As  ma��s  custam  R$  1,30  cada  se  forem  compradas  menos  de  uma  d�zia, e  R$  1,00  se  forem compradas  pelo  menos  12.
