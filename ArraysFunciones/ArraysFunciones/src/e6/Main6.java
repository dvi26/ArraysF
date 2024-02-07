package e6;

import java.util.Arrays;
import java.util.Scanner;
public class Main6 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int t[]= {5,3,5,3,8,5,7,3,2,1,7,9};
		int numElementos=sc.nextInt();
		System.out.println(Arrays.toString(Suma.suma(t, numElementos)));

	}

}
