package e1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int num[][];
		Scanner sc = new Scanner(System.in);
		num = new int[3][6];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i == 0 && j == 3) || (i == 0 && j == 4) || (i == 1 && j == 1) || (i == 1 && j == 2)
						|| (i == 1 && j == 3) || (i == 1 && j == 5) || (i == 2 && j == 0) || (i == 2 && j == 1)
						|| (i == 2 && j == 4)) {
					continue;
				}
				System.out.println("Introduzca la posicion " + i + " " + j);
				num[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < 6; j++) {
				System.out.print(num[i][j]);
				System.out.print("\t");
			}
		}
		sc.close();
	}

}
