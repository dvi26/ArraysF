package main;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N;
		int M;
		System.out.println("Introduzca un numero");
		N = sc.nextInt();
		System.out.println("Introduzca otro numero");
		M = sc.nextInt();
		int tabla[] = new int[N];
		Arrays.fill(tabla, M);
		System.out.println(Arrays.toString(tabla));
	}

}
