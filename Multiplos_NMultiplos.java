package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Multiplos_NMultiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
			if ( A % B == 0 || B % A == 0 ) {
				System.out.println("SÃO MULTIPLOS");
			}
			else {
				System.out.println("NÃO SÃO MULTIPLOS");
			}
		
		/*O "ou" diferencia o resultando fazendo com que eu não tenha que
		 * inverter a ordem dos numeros para assim mesmo darem um resultado correto.*/
			
		sc.close();
	}

}
