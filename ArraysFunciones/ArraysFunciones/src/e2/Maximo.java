package e2;

import java.util.Arrays;

public class Maximo {
public static int maximo(int t[]) {
	int maximo=0;
	Arrays.sort(t);
	maximo=t[t.length-1];
	return maximo;
}
}
