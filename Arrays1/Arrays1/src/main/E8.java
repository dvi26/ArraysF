package main;

import java.util.Arrays;
import java.util.Scanner;

public class E8 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int contador = 0;
		int[] tabla = new int[100];
		System.out.println("Introduzca un número");
		int num = sc.nextInt();
		for (int i = 0; i < tabla.length; i++) {
			int aleatorio = (int) (Math.random() * 10) + 1;
			tabla[i] = aleatorio;
			contador = contador + 1;
			if (num == tabla[i]) {
				System.out.println("Aparece en la posición " + contador);
			}
		}
		System.out.println(Arrays.toString(tabla));
	}

}
