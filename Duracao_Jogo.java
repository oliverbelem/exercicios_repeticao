package Exercicos2;

import java.util.Locale;
import java.util.Scanner;

public class Duracao_Jogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int diferenca;
		int Hinicial = sc.nextInt();
		int Hfinal = sc.nextInt();
		
		
			if (Hinicial < Hfinal) {
				diferenca = Hinicial - Hfinal;
			}
			else {
				diferenca = 24 - Hinicial + Hfinal;
			}
			
		System.out.println("O JOGO DUROU " + diferenca + " HORA(S)");
			
		sc.close();
	}

}
