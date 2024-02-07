package main;

import java.util.Arrays;
import java.util.Scanner;

public class E5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int suma = 0;
		int máximo = 0;
		int mínimo = 0;
		int[] tabla = new int[10];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero");
			int num = sc.nextInt();
			tabla[i] = num;
			if (i != 0) {
				if (num > tabla[i - 1] && máximo < num) {
					máximo = num;
				}

			}

			suma = tabla[i] + suma;
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("La suma es de " + suma);
		System.out.println("El máximo es " + máximo);
		System.out.println("El mínimo es " + mínimo);
	}

}
