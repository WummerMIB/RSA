import java.util.Scanner;

public class MiniRSA {

	public int encrypt(int k, int e, int N) {
		int c = (int)(Math.pow(k, e)) % N;
		return  c; 
	}
	
	public int decrypt(int c, int d, int N) {
		int k = (int)(Math.pow(c, d)) % N;
		return k;
	}
	
}
