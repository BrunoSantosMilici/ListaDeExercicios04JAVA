package lista04;

import java.util.Scanner;

public class Lista04_exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int valor = sc.nextInt();
		
		if (valor>0) {
			System.out.println("Este valor � positivo");
		} else {
			System.out.println("Este valor � negativo");
		}
		
	}

}
// alg que fala se n�mero � positivo ou negativo