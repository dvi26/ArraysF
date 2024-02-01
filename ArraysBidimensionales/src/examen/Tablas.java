package examen;

import java.util.Arrays;

public class Tablas {
	static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };
	static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };
	static int[][] cantidades = new int[4][4];
	static String[] ventas;
	double total;

	static void rellenarMatriz(int num) {
		for (int i = 0; i < cantidades.length; i++) {
			for (int j = 0; j < 4; j++) {
				cantidades[i][j] = num;
			}
		}
	}

	static void mostrarGolosinas() {
		int contador = 0;
		for (int i = 0; i < nombresGolosinas.length; i++) {
			if (i > 0) {
				System.out.println();

			}
			for (int j = 0; j < 4; j++) {
				contador++;
				System.out.print(nombresGolosinas[i][j] + " " + contador);
				System.out.print("\t");
				System.out.print(precio[i][j] + "€");
				System.out.print("\t");
			}
		}
	}

	static boolean validarPos(int fila, int columna) {
		boolean condicion = true;
		if (fila > 3 || columna > 3 || fila < 0 || columna < 0) {
			condicion = false;
		}
		return condicion;
	}

	static boolean hayValorPosicion(int fila, int columna) {
		boolean condicion = false;
		if (cantidades[fila][columna] > 0) {
			condicion = true;
		}
		return condicion;
	}

	static void aumentarPosicion(int fila, int columna, int cantidad) {
		cantidades[fila][columna] = cantidades[fila][columna] + cantidad;
	}

	void anyadirVenta(int fila, int columna) {
		int contador = 0;
		ventas[contador].equals(nombresGolosinas[fila][columna]);
		contador++;
		total = total + precio[fila][columna];
	}

	void imprimirVentasTotales() {
		System.out.println(Arrays.toString(ventas) + total);
	}
}
