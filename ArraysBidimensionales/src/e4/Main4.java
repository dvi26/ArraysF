package e4;

public class Main4 {

	public static void main(String[] args) {
		for (int i = 0; i < Tabla().length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < Tabla()[i].length; j++) {
				System.out.print(Tabla()[i][j]);
				System.out.print("\t");
			}
		}
	}

	static int[][] Tabla() {
		int tabla[][] = new int[10][10];
		for (int i = 0; i < tabla.length; i++)
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		return tabla;
	}

}
