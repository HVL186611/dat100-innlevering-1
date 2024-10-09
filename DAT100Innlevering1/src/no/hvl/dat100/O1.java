package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		System.out.println(grade());
		System.out.println("\nInput 10 karakterer:");
		grades();
	}
	
	public static char[] grades() {
		char[] l = new char[10];
		for (int i = 0; i < 10; i++) {
			char g = grade();
			System.out.println("Karakter: " + g);
			l[i] = g;
		}
		return l;
	}
	
	public static char grade() {
		int i = Integer.parseInt(showInputDialog(""));
		if (i > 100 || i < 0) {
			System.out.println("Karakteren " + i + " er utenfor rekkevidden (0-100).");
			return grade(); // recur hvis utenfor rekkevidde
		}
		if (i >= 90) return 'A';
		if (i >= 80) return 'B';
		if (i >= 60) return 'C';
		if (i >= 50) return 'D';
		if (i >= 40) return 'E';
		return 'F';
	}
}
