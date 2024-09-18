package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <=100; i = i + 9) {
			System.out.println("Grade: " + grade(i) + " Score: " + i);
		}
		grade(new int[] {1, 19, 50, 66, 90, 101, -1, 44, 78, 0});
//		System.out.println(grade(new int[] {1, 19, 50, 66, 90}));
	}
	
	public static char grade(int i) {
		if (i > 100 || i < 0) {
			System.out.println("Karakteren " + i + " er utenfor rekkevidden (0-100).");
			return '-';
		}
		if (i >= 90) return 'A';
		if (i >= 80) return 'B';
		if (i >= 60) return 'C';
		if (i >= 50) return 'D';
		if (i >= 40) return 'E';
		return 'F';
	}
	
	public static char[] grade(int[] i) {
		
		char[] j = new char[i.length];
		for (int k = 0; k < i.length; k++) {
			j[k] = grade(i[k]);
			while (j[k] == '-') {
				System.out.println("Skriv inn ny verdi: ");
				j[k] = grade(Integer.parseInt(showInputDialog("Karakter utenfor rekkevidde (0-100), skriv ny verdi:")));
			}
			System.out.println(j[k]);
		}
		return j;
	}

}
