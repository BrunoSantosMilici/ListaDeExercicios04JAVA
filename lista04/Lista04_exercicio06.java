package lista04;

import java.util.Scanner;

public class Lista04_exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seu ano de nascimento");
		int anoNas = sc.nextInt();
		System.out.println("Ano Atual");
		int anoAt = sc.nextInt();
		
		int idade = anoAt - anoNas;
		
		if (idade>16) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		
		

	}

}
//Ler  o  ano  atual  e  o  ano  de  nascimento  de  uma  pessoa.  Escrever  uma mensagem  que  diga  se  ela poderá ou não votar este ano