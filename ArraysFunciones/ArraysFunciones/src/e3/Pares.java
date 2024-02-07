package e3;

import java.util.Arrays;
import java.util.Random;

public class Pares {
	public static int[] rellenaPares(int longitud, int fin) {
		int pares[] = new int[longitud];
		int numero = 0;
		Random random = new Random();
		for (int i = 0; i < pares.length; i++) {
			numero = random.nextInt(1, fin + 1);
			if (numero % 2 == 0) {
				pares[i] = numero;
			} else {
				i--;
			}
		}
		Arrays.sort(pares);
		return pares;
	}
}
