package lista04;

import java.util.Scanner;

public class Lista04_exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float acrescimo = 0;
		
		System.out.println("Digite o seu sal�rio fixo");
		float SalarioFixo = sc.nextFloat();
		System.out.println("Digite o valor das vendas efetuadas:");
		float Valor_Vendas= sc.nextFloat();
		
		if (Valor_Vendas<=1500) {
			acrescimo = (Valor_Vendas * 3 / 100);
		} else {
			acrescimo = (Valor_Vendas * 3 / 100) + (5 * (Valor_Vendas - 1500)) / 100;
		}
		float SalarioTotal = SalarioFixo + acrescimo;
		
		System.out.println("O sal�rio total � de " + SalarioTotal + "R$");

	}

}
//Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele  recebe  uma  comiss�o  de  3%  sobre  o  total  das  vendas  at�  R$  1.500,00  mais  5%  sobre  o  que ultrapassar este valor, calcular e escrever o seu sal�rio total.