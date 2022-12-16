package lista04;

import java.util.Scanner;

public class Lista04_exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float total = 0;
		
		System.out.println("Qual é o seu salário em horas:");
		float SalHoras = sc.nextFloat();
		System.out.println("Quantas horas foram trabalhadas no mês");
		int horasTrab = sc.nextInt();
		
		int horasAdc = horasTrab - 160;
		float acrescimo = ((SalHoras * 50) / 100) * horasAdc;
		
		if (horasTrab>160) {
			total = (SalHoras * horasTrab) + acrescimo;
		} else {
			total = SalHoras * horasTrab;
		}
		System.out.println("O salário total é de: " + total + " R$");
	}

}
//um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas