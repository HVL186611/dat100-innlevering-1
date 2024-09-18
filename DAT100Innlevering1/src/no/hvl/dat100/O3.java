package no.hvl.dat100;

import java.math.BigInteger;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(1000));
	}
	
	public static BigInteger factorial(int n) {
		if (n <= 0) return BigInteger.valueOf(0);
		BigInteger o = BigInteger.valueOf(n);
		while (n > 1) {
			n--;
			o = o.multiply(BigInteger.valueOf(n));
		}
		return o;
	}
}
