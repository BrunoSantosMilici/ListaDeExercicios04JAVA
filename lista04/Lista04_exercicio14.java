package lista04;

import java.util.Scanner;

public class Lista04_exercicio14 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Qual � a quantidade atual do estoque?");
	int estoqueAt = sc.nextInt();
	System.out.println("Qual � a quantidade m�nima de estoque?");
	int estoqueMin = sc.nextInt();
	System.out.println("Qual � a quantidade m�xima do estoque?");
	int estoqueMax = sc.nextInt();
	
	float quantMedia = (estoqueMin + estoqueMax) /2;
	
	if (quantMedia <= estoqueAt) {
		System.out.println("N�o efetuar a compra");
	} else {
		System.out.println("Efetuar a compra");
	}
	}

}
//um  algoritmo  para  ler:  quantidade  atual  em  estoque,  quantidade  m�xima  em  estoque  e quantidade  m�nima  em  estoque  de  um  produto.  Calcular  e  escrever  a  quantidade  m�dia  ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual a  quantidade  m�dia  escrever  a  mensagem  'N�o  efetuar  compra',  sen�o  escrever  a  mensagem  'Efetuar compra'.