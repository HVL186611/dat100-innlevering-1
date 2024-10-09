package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		System.out.println("Input inntekt:");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Skatt: " +
				trinnskatt(
						Double.parseDouble(
								sc.next()
								)
						)
				);
		sc.close();
	}
	
	public static double trinn(int min, int max, double moneySoBig) {
		moneySoBig -= min;
		if (max == -1)
			return Math.max(0, moneySoBig);
		return Math.max(0, Math.min(max, moneySoBig));
	}
	
	public static double trinnskatt(double cashMoney) {
		double toBigBrother = 0d;
		toBigBrother += trinn(208050, 292850, cashMoney) * 0.017;
		toBigBrother += trinn(292851, 670000, cashMoney) * 0.04;
		toBigBrother += trinn(670000, 937900, cashMoney) * 0.136;
		toBigBrother += trinn(937900, 1350000, cashMoney) * 0.166;
		toBigBrother += trinn(1350000, -1, cashMoney) * 0.176;
		
		return toBigBrother;
		// forsto det slik at skatten bare gjelder for inntekten
		// i rekkevidden, altså ikke det over og under. Så jeg
		// tar bare prosenten av pengenem mellom rekkevidden til
		// trinnet.
	}
}
