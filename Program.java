package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		int y = sc.nextInt();
		int[][] mat = new int[n][y];

		for (int i = 0; i < mat.length; i++) {
			for (int x = 0; x < mat[i].length; x++) {
				mat[i][x] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int x = 0; x < mat[i].length; x++) {
				if (mat[i][x] == m) {

					System.out.println("Position " + i + "," + x + ": ");
					if (x > 0) {
						System.out.println("Left: " + mat[i][x - 1]);
					}
					if (x < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][x + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][x]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][x]);
					}
				}
			}
		}
		sc.close();
	}
}
