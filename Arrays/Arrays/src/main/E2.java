package main;

import java.util.Arrays;

public class E2 {

	public static void main(String[] args) {
		int tabla[] = new int[55];
		for(int i = 1;i<11;Arrays.fill(tabla, 0,i,i) ) {
			i++;
		}
		System.out.println("Arrays.toString(tabla)");
	}

}
