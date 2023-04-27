package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Identificacao_Intervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Escreva o Valor que deseja saber o intervalo");
		double valor = sc.nextDouble();
		
			if ( 0 < valor && valor <= 25) {
				System.out.println("Intervalo (0,25)");
			}
			else if (25 < valor && valor <= 50) {
				System.out.println("Intervalo (25, 50)");
			}
			else if (50 < valor && valor <= 75) {
				System.out.println("Intervalo (50, 75)");
			}
			else if (75 < valor && valor <= 100) {
				System.out.println("Intervalo (75, 100)");
			}
			else {
				System.out.println("O valor não está em nenhum intervalo entre 0 e 100, multiplos de 25");
			}
		
		sc.close();
	}

}
