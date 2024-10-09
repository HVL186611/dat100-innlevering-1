package no.hvl.dat100;

import java.math.BigInteger;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		while (true) {
			String input = showInputDialog("Fakultet av:");
			try {System.out.println(Integer.parseInt(input));}
			catch (NumberFormatException e) {
				System.out.println("Input ikke godkjent, avbryter.");
				return;
			}
		}
	}
	
	public static BigInteger factorial(int n) {
		if (n <= 0) return BigInteger.valueOf(0);
		BigInteger o = BigInteger.valueOf(n);
		while (n > 1) {
			o = o.multiply(BigInteger.valueOf(--n));
		}
		return o;
	}
}
