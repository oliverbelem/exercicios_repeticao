package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Coordenadas_em_planos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Escreva dois valores para saber em qual quadrande se encontram: ");
		
		/*
		  No exercicio original não há a explicação de qual deve ser colocado primeiro, mas por convenção será primeiro 
		 inserido o valor de X e em seguida o valor de Y
		  .
		  In the original exercise there is no explanation of which should be placed first, but by convention it will be first
 		 enter the value of X and then the value of Y */
		
		System.out.print("Valor de X...:");
		double Eixox = sc.nextDouble();
		
		System.out.print("Valor de y...:");
		double Eixoy = sc.nextDouble();
		
		/* Q1 = x = + && y = +
		 * Q2 = x = + && y = -
		 * Q3 = x = - && y = -
		 * Q4 = x = - && y = +
		 * */
		
			if (Eixox > 0 && Eixoy > 0) {
				System.out.println("Q1");
			}
			else if (Eixox > 0 && Eixoy < 0) {
				System.out.println("Q2");
			}
			else if (Eixox < 0 && Eixoy < 0) {
				System.out.println("Q3");
			}
			else if (Eixox <0 && Eixoy > 0) {
				System.out.println("Q4");
			}
			else {
				System.out.println("Origem");;
			}

		sc.close();

	}

}
