package e5;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main5 {
	static Random random = new Random();

	public static void main(String[] args) {
		int sumafila = 0;
		int sumacolumna = 0;
		int sumatotal = 0;
		int Tabla[][] = new int[4][5];
		Tabla = Tabla();
		for (int i = 0; i < Tabla.length; i++) {
			if (i > 0) {
				System.out.println();
				sumatotal = sumatotal + sumafila;
				sumafila = 0;

			}

			for (int j = 0; j < Tabla[i].length; j++) {
				System.out.print(Tabla[i][j]);
				System.out.print("\t");
				sumatotal = sumatotal + (Tabla[i][j]);
				sumafila = sumafila + (Tabla[i][j]);
				if (j == 4) {
					System.out.print("Fila " + i + ": " + sumafila);
				}

			}
		}
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			if (i > 0) {
				System.out.print("C" + i + " " + sumacolumna + " ");
				sumatotal= sumatotal+sumacolumna;
				sumacolumna = 0;
			}
			if (i == 5) {
				break;
			}
			for (int j = 0; j < 4; j++) {
				sumacolumna = sumacolumna + (Tabla[j][i]);

			}
		}
		System.out.print("Total: " + sumatotal);
	}

	static int[][] Tabla() {
		int tabla[][] = new int[4][5];
		for (int i = 0; i < tabla.length; i++)
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = random.nextInt(100, 999);
			}
		return tabla;
	}
}
