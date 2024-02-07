package e4;

public class Busqueda {
	public static int buscar(int t[], int clave) {
		int valor=clave;
		int posicion=0;
		int indice=0;
		while(indice<t.length && valor != t[indice]) {
		indice++;	
		}
		if(indice<t.length) {
			posicion=indice+1;
		}else {
			posicion=-1;
		}
		return posicion;
	}
}
