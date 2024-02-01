package e2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int tabla[][];
		Scanner sc = new Scanner(System.in);
		tabla = new int[4][5];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduzca la nota de Alumno "  + (i+1));
				tabla[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(tabla[i][j]);
				System.out.print("\t");
			}
		}
	}

}
