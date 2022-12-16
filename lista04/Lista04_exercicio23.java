package lista04;

import java.util.Scanner;

public class Lista04_exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float desconto = 0;
		float total = 0;
		
		System.out.println("Quantidade de litros de combustível vendidos");
		float quant = sc.nextFloat();
		
		System.out.println("Tipo de combustível vendido (A para Àlcool eG para Gasolina)");
		String tipo = sc.next();
		
		if (tipo.equals("A")){
			if (quant <= 20) {
			desconto = (float) (0.03 * (quant * 2.90));	
			total = (float) ((quant * 2.90) - desconto);
			} else {
				desconto = (float) (0.05 * (quant * 2.90));	
				total = (float) ((quant * 2.90) - desconto);
			}
			System.out.println("O valor a ser pago é: " + total + "R$");
		}
		
		if (tipo.equals("G")){
			if (quant <= 20) {
			desconto = (float) (0.04 * (quant * 3.30));	
			total = (float) ((quant * 3.30) - desconto);
			} else {
				desconto = (float) (0.06 * (quant * 3.30));	
				total = (float) ((quant * 3.30) - desconto);
			}
			System.out.println("O valor a ser pago é: " + total + "R$");
		}
		
		
		
		
		
		
		
	}

}
//um  algoritmo  que  leia  o  número  de  litros  vendidos  e  o  tipo  de  combustível (codificado  da seguinte  forma: A-álcool, G-gasolina),  calcule  e  imprima  o  valor  a  ser  pago  pelo  cliente  sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
