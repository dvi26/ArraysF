package e5;



public class Buscar {
	public static int[] buscarTodos(int t[], int valor) {
		int posicion = 0;
		int contador=0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				posicion++;
			}
		}
		int indices[] = new int[posicion];
		posicion=0;
		for (int i = 0; i < t.length; i++) {
			posicion++;
			if (t[i] == valor) {
				indices[contador] = posicion;
				contador++;
			}

		}
		return indices;
	}
}
