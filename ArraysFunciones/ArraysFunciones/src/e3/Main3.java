package e3;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la longitud");
		int longitud=sc.nextInt();
		System.out.println("Introduzca hasta donde llega");
		int fin=sc.nextInt();
		System.out.println(Arrays.toString(Pares.rellenaPares(longitud, fin)));
	}

}
