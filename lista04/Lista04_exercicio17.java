package lista04;

import java.util.Scanner;

public class Lista04_exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maior1 = 0;
		int maior2 = 0;
		
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor3 = sc.nextInt();
		
		if (valor1>valor2) {
		 maior1 = valor1;
		} else {
		maior1 = valor2;
		}
		
		if (valor3>valor1) {
			maior2 = valor3;
		} else if (valor3>valor2){
			maior2 = valor3;
		} else {
			maior2 = valor2;
		}
			int soma = maior1 + maior2;
			System.out.println("A soma dos dois maiores valores é igual a: " + soma);
	}

}
//Ler  3  valores (considere  que  não  serão  informados  valores  iguais) e  escrever  a  soma  dos  2 maiores.
