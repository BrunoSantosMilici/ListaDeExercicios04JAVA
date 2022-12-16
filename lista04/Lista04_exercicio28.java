package lista04;

import java.util.Scanner;

public class Lista04_exercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Primeira nota");
		float n1 = sc.nextFloat();
		System.out.println("segunda nota");
		float n2 = sc.nextFloat();
		System.out.println("terceira nota");
		float n3 = sc.nextFloat();
		System.out.println("Nota dos exercícios");
		float exercicios = sc.nextFloat();
		
		String conceito = null;
		
		float aproveitamento =((n1 + n2 *2 + n3 * 3 + exercicios) / 7);
		if (aproveitamento>=9) {
			conceito = ("A");
		} else {
			if (aproveitamento >=7.5 && aproveitamento <9.0) {
				conceito=("B");
			}else {
				if (aproveitamento >=6 && aproveitamento < 7.5) {
					conceito = ("C");
				} else {
					if (aproveitamento < 6) {
						conceito = ("D");
					}
				}
			}
		}
		System.out.println("O seu conceito é " + conceito);
	}

}
// calculadora de conceito escolar