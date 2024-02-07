package e8;

public class Main8 {

	public static void main(String[] args) {
		int[][] Tabla = { { 1, 2, 3, 7 }, { 2, 4, 5, 8 }, { 3, 5, 6, 9 }, { 7, 8, 9, 10 } };
		if (Tabla(Tabla)) {
			System.out.println("Es simetrica");
		} else {
			System.out.println("No es simetrica");
		}

	}

	public static boolean Tabla(int[][] tabla) {
		boolean condicion = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					condicion = false;
				}
			}
		}
		return condicion;
	}
}
