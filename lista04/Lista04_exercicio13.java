package lista04;

import java.util.Scanner;

public class Lista04_exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número de sua conta:");
		float conta = sc.nextInt();
		System.out.println("Seu saldo:");
		float saldo = sc.nextInt();
		System.out.println("Seu débito:");
		float debito = sc.nextInt();
		System.out.println("Credito:");
		float credito = sc.nextInt();
		
		float Total = saldo - debito + credito;
		
		if (Total>=0) {
			System.out.println("O saldo total é de " + Total);
		} else {
			System.out.println("Aviso: Saldo negativo");
			System.out.println("O saldo total é de: " + Total);
		}
		
	}

}
//um  algoritmo para ler: número da  conta do cliente, saldo, débito e  crédito. Após,  calcular e escrever o saldo atual