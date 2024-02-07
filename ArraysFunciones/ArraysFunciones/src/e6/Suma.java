package e6;

public class Suma {
	public static int[] suma(int t[], int numElementos) {
		int repeticiones = 0;
		int suma = 0;
		int suma3 = numElementos;
		int suma4=0;
		int contador = -1;
		if (t.length % numElementos == 0) {
			repeticiones = (t.length) / numElementos;
		}
		int tabla[] = new int[repeticiones];
		while (contador < repeticiones-1) {
			contador++;
			for (int i = suma4; i < suma3; i++) {
				suma = t[i] + suma;
			}
			tabla[contador] = suma;
			suma = 0;
			suma3= suma3+numElementos;
			suma4=suma4+numElementos;
		}

		return tabla;
	}
}
