package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Num_Par_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int Num;
		
		Num = sc.nextInt();
		
			if ( Num % 2 == 0 ) {
				System.out.println ("PAR");
			}
			else {
				System.out.println ("ÍMPAR");
			}
		
		sc.close();
	}

}
