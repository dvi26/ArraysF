package e5;

import java.util.Random;

public class Main5 {
	static Random random = new Random();

	public static void main(String[] args) {
		int sumafila=0;
		int sumacolumna=0;
		int sumatotal=0;
		for (int i = 0; i < Tabla().length; i++) {
			if (i > 0) {
				System.out.println();
				sumafila=0;
				sumacolumna=0;
			}
			for (int j = 0; j < Tabla()[i].length; j++) {
				System.out.print(Tabla()[i][j]);
				System.out.print("\t");
				if (j==4) {
					System.out.print("Fila " + i + ": "+ sumafila);
				}
				sumatotal=sumatotal+(Tabla()[i][j]);
				sumafila=sumafila+(Tabla()[i][j]);
				sumacolumna=sumacolumna+(Tabla()[i][j]);
			}
		}
	}

	static int[][] Tabla() {
		int tabla[][] = new int[4][5];
		for (int i = 0; i < tabla.length; i++)
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = random.nextInt(999) + 100;
			}
		return tabla;
	}
}
