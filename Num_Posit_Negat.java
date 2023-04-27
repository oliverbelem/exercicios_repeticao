package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Num_Posit_Negat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int Num;
		
		Num = sc.nextInt();
		
		if (Num < 0) {
			System.out.println ("O NUMERO É NEGATIVO");
		}
		else {
			System.out.println ("O NUMERO É POSITIVO");
		}
		
		sc.close();
	}

}
