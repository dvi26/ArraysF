package main;

import java.util.Arrays;

public class E4 {

	public static void main(String[] args) {
		int[] num = new int[12];
		for (int i=0;i<num.length;i++) {
			switch (i) {
			case 0: num[i]=39;
			break;
			case 1: num[i]=-2;
			break;
			case 4: num[i]=0;
			break;
			case 6: num[i]=14;
			break;
			case 8: num[i]=5;
			break;
			case 9: num[i]=120;
			break;
			}
		}
		System.out.println(Arrays.toString(num));

	}
	

}
