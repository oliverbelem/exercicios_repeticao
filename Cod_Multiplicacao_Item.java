package Exercicos2;

import java.util.Scanner;

public class Cod_Multiplicacao_Item {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int Cod = sc.nextInt();
		int Quant = sc.nextInt();
		
		double Total = 0;
		
		switch (Cod) {
		case 1:
			Total = Quant * 4;
			break;
		case 2:
			Total = Quant * 4.50;
			break;
		case 3:
			Total = Quant * 5;
			break;
		case 4:
			Total = Quant * 2;
			break;
		case 5:
			Total = Quant * 1.50;
			break;
		}
		
		System.out.printf("Total: R$%.2f", Total);
		
		sc.close();
	}

}
