package main;

import java.util.Scanner;

public class E7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double[] tabla = new double[12];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println();
			System.out.println("Introduzca la temperatura " + "Mes" + "(" + i + ")");
			double num = sc.nextDouble();
			tabla[i] = num;
			for (int j = -1; j < num; j++) {
				System.out.print("*");
			
			}
		}
	}
}