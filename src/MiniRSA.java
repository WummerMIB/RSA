// 2120717 Marco Mohr, 2123474 Marie Kapusta
import java.util.Scanner;

public class MiniRSA {

	// Public Key to encrypt the numbers
	int e = 5;
	// Number for the modulus to encrypt
	int N = 21;
	// Private Key to decrypt the number
	int d = 5;
	
	public int encrypt(int k) {
		// Uses the RSA encryption to change a Number into a other k^e modulus N
		return (int) (Math.pow(k, e)) % N;
	}

	public int decrypt(int c) {
		// Uses the RSA encryption to change the encrypted Number back to its original
		// number
		return (int) (Math.pow(c, d)) % N;
	}

}
