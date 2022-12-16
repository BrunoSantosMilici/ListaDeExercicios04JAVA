package lista04;

import java.util.Scanner;

public class Lista04_exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nome do produto");
		String nome = sc.next();
		
		System.out.println("Preço do produto unitário");
		float precoUni = sc.nextFloat();
		
		System.out.println("Quantidade do produto");
		float quant = sc.nextFloat();
		int total = (int) (quant * precoUni);
		float desconto = (float) (total * 0.02);
		
		
		if (quant <= 5) {
			desconto = (float) (total * 0.02);
		} 
		else {
			if (quant > 5 && quant<=10) {
				desconto = (float) (total * 0.03);
			} 
			else {
				
				if (quant > 10) {
					desconto = (float) (total * 0.05);
				}
			}
		}
		float pagamento = total - desconto;
		System.out.println("O preço a ser pago é " + pagamento + "R$");
	}

}
// calculadora de preços de produtos