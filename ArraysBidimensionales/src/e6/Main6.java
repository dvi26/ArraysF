package e6;

import java.util.Random;

public class Main6 {
	static Random random = new Random();

	public static void main(String[] args) {
		int[][] tabla = new int[6][10];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = random.nextInt(1001);
			}
		}
		int[] TablaF = Tabla(tabla);

		System.out.println("El valor minimo es: " + TablaF[0]);
		System.out.println("El valor maximo es: " + TablaF[1]);
	}

	public static int[] Tabla(int[][] tabla) {
		int Tabla[] = new int[2];
		int minimo = 0;
		int maximo = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
					minimo = Tabla[0];
				}
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
					maximo = Tabla[1];
				}
			}
		}
		return Tabla;
	}

}
