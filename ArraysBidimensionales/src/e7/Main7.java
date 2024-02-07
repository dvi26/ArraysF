package e7;

public class Main7 {

	public static void main(String[] args) {
		int[][] Tabla = new int[4][4];
		int contador = 1;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				Tabla[i][j] = contador;
				contador++;

			}
		}
		Tabla = Tabla(Tabla);
		for (int i = 0; i < 4; i++) {
			if (i > 0) {
				System.out.println();

			}

			for (int j = 0; j < 4; j++) {
				System.out.print(Tabla[i][j]);
				System.out.print("\t");
			}
		}

	}

	public static int[][] Tabla(int[][] tabla) {
		int[][] Tabla = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Tabla[j][i] = tabla[i][j];
			}
		}
		return Tabla;
	}

}
