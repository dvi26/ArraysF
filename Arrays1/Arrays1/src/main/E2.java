package main;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		double[] tabla = new double[5];
		for(int i=0;i<tabla.length;i++) {
		System.out.println("Introduzca un numero decimal");
		double num=sc.nextDouble();
		tabla[i]=num;
		}
		System.out.println(Arrays.toString(tabla));
	}

}
