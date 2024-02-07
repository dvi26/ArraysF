package main;

import java.util.Arrays;
import java.util.Scanner;

public class E3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
			int[] tabla = new int[10];
			for(int i=tabla.length-1;i>=0;i--) {
			System.out.println("Introduzca un numero");
			int num=sc.nextInt();
			tabla[i]=num;
			}
			System.out.println(Arrays.toString(tabla));
		}

	}


