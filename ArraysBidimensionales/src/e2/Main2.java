package e2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int tabla[][];
		int minimo = 0;
		int maxima = 0;
		double media = 0;
		int alumno = 1;
		Scanner sc = new Scanner(System.in);
		tabla = new int[4][5];
		for (int i = 0; i < tabla.length; i++) {
			if (i > 0) {
				System.out.println("La media de Alumno " + alumno + " es de " + media);
				System.out.println("La nota maxima de Alumno " + alumno + " es de " + maxima);
				System.out.println("La nota minima de Alumno " + alumno + " es de " + minimo);
				media = 0;
				alumno++;
			}
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduzca la nota de Alumno " + (i + 1));
				tabla[i][j] = sc.nextInt();
				if (j == 0) {
					maxima = tabla[i][j];
					minimo = tabla[i][j];
				}
				if ((j > 0) && (tabla[i][j] > maxima)) {
					maxima = tabla[i][j];
				}
				if ((j > 0) && (tabla[i][j] < minimo)) {
					maxima = tabla[i][j];
				}
				media = media + tabla[i][j];
				if (j == 4) {
					media = media / 5;
				}
			}
		}
		media = media / 5;
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
