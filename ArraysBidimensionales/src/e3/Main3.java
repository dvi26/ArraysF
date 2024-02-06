package e3;

import java.util.Scanner;

public class Main3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tabla[][] = new int[10][10];
		Tabla(tabla);
		for (int i = 0; i < tabla.length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]);
				System.out.print("\t");
			}
		}

	}

	static void Tabla(int tabla[][]) {
		for (int i = 0; i < tabla.length; i++)
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
	}
}
