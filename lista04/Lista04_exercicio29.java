package lista04;
import java.util.Scanner;

public class Lista04_exercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Código de identificação");
		int cod = sc.nextInt();
		System.out.println("Seu ano de nascimento");
		int anoNas = sc.nextInt();
		System.out.println("Anos trabalhados");
		int anosTrab = sc.nextInt();
		
		int idade = 2022 - anoNas;
		
		if(idade>=65 || anosTrab>=30 || idade>=60 && anosTrab>=25) {
			System.out.println("Requer aposentadoria");
		} else {
			System.out.println("Não requer aposentadoria");
		}
		
	}

}
//calculador de aposentadoria (seguindo os parâmetros propostos no enunciado do exercício)
//parâmetros: ter 65 anos ou mais |ou| ter tranalhado por 30 anos ou mais |ou| ter trabalhado 25 ou mais anos e ser maior de 60 anos.