package main;

import java.util.Arrays;

public class E1 {

	public static void main(String[] args) {
		int[] tabla = new int[10];
		for (int i=0;i<tabla.length;i++) {
			int aleatorio = (int)( Math.random()*100)+1;
			tabla[i]=aleatorio;
		}
		System.out.println(Arrays.toString(tabla));
	}

}
