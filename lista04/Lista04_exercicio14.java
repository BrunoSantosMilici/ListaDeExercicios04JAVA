package lista04;

import java.util.Scanner;

public class Lista04_exercicio14 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Qual é a quantidade atual do estoque?");
	int estoqueAt = sc.nextInt();
	System.out.println("Qual é a quantidade mínima de estoque?");
	int estoqueMin = sc.nextInt();
	System.out.println("Qual é a quantidade máxima do estoque?");
	int estoqueMax = sc.nextInt();
	
	float quantMedia = (estoqueMin + estoqueMax) /2;
	
	if (quantMedia <= estoqueAt) {
		System.out.println("Não efetuar a compra");
	} else {
		System.out.println("Efetuar a compra");
	}
	}

}
//um  algoritmo  para  ler:  quantidade  atual  em  estoque,  quantidade  máxima  em  estoque  e quantidade  mínima  em  estoque  de  um  produto.  Calcular  e  escrever  a  quantidade  média  ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a  quantidade  média  escrever  a  mensagem  'Não  efetuar  compra',  senão  escrever  a  mensagem  'Efetuar compra'.