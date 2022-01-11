import java.util.Scanner;

public class MiniRSA {

	public int encrypt(int k, int e, int N) {
		// Uses the RSA encryption to  change a Number into a other k^e modulus N
		int c = (int)(Math.pow(k, e)) % N;
		return  c; 
	}
	
	public int decrypt(int c, int d, int N) {
		// Uses the RSA encryption to  change the encrypted Number back to its original number
		int k = (int)(Math.pow(c, d)) % N;
		return k;
	}
	
}
