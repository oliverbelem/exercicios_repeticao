package Exercicos2;

import java.util.Scanner;
import java.util.Locale;

public class Imposto_por_salario {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.print("Digite seu Salário...:");
		double Salario = sc.nextDouble();
		double imposto;
		
			if (Salario <= 2000.0) {
				imposto = 0.0;
			}
			else if (Salario <= 3000.0) {
				imposto = (Salario - 2000.0) * 0.08;
			}
			else if (Salario <= 4500.0) {
				imposto = (Salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			}
			else {
				imposto = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			}
		
				if (imposto == 0.0) {
					System.out.println("Isento");
				}
				else {
					System.out.printf("R$ %.2f%n", imposto);
				}
		
		sc.close();*/
		
		int x, y, res;
		x = 100;
		y = 20;
		
		while (x >= y -1) {
			x = x - 1;
			y = y + 2;
		}
			res = y - x;
		
		System.out.println(res);

	}

}
