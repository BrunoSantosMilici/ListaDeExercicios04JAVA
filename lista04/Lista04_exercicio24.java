package lista04;

import java.util.Scanner;

public class Lista04_exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int armazem = 0;
		
		System.out.println("Idade do primeiro homem");
		int homem1 = sc.nextInt();
				System.out.println("Idade do segundo homem");
		int homem2 = sc.nextInt();
		
		System.out.println("Idade da primeira mulher");
		int mulher1 = sc.nextInt();
		System.out.println("Idade da segunda mulher");
		int mulher2 = sc.nextInt();
		
		if (mulher1 < mulher2) {
			armazem = mulher1;
			mulher1 = mulher2;
			mulher2 = armazem;
		}
		if (homem1 < homem2) {
			armazem = homem1;
			homem1 = homem2;
			homem2 = homem1;
		}
		
		int soma = mulher2 + homem1;
		float produto = mulher1 / homem2;
		System.out.println("A soma das idades do homem mais velho e da mulher mais nova é " + soma);
		System.out.println("O produto das idade do homem mais novo e da mulher mais velha é " + produto);
	}

}
//algoritmo  que  leia  as  idades  de  2  homens  e  de  2  mulheres (considere  que  as  idades dos  homens  serão  sempre  diferentes  entre  si,  bem  como  as  das  mulheres).  Calcule  e  escreva  a  soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova,  e  o  produto  das  idades  do  homem  mais novo com a mulher mais velha.