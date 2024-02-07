package main;

import java.util.Arrays;
import java.util.Scanner;

public class E3 {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		for (int i=1;i<21;i++) {
			if (i<=10) {
			int N= sc.nextInt();
			tabla1[i]=N;
			}
			if (i>10) {
				tabla2[i]=N;
			}
			
		}
		System.out.println(Arrays.equals(tabla1, tabla2));
	}

}
