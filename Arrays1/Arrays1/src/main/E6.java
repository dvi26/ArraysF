package main;

import java.util.Arrays;
import java.util.Scanner;

public class E6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tabla = new int[8];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero");
			int num = sc.nextInt();
			tabla[i] = num;

		}
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		}
		System.out.println(Arrays.toString(tabla));
		sc.close();
	}

}
