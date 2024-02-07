package e1;

public class Tabla {
	
	public static int Enteros(int[] tabla) {
		int suma=0;
		for (int i=0;i<tabla.length;i++) {
			suma=tabla[i]+suma;
		}
		return suma;	
		}
}
	

