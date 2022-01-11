import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MiniRSA kryp = new MiniRSA();
		// Public Key to encrypt the numbers 
		int e = 5;
		// Number for the modulus to encrypt
		int N = 21;
		// Private Key to decrypt the number
		int d = 5;
		// saves number in to c needs to initialize 
		int c = 0;	
		
		System.out.println("Geben sie eine Zahl ein um die Einzelziffern zu encrypten");
		// Input a number this number gets cut in its 
		Scanner numIntobj = new Scanner(System.in);
		int numInt = numIntobj.nextInt();
		// Creates an Objekt an gives am the Input number to cut up and enrypt and decrypt it 
		Crypto cryp = new Crypto(numInt); 
		
		System.out.println("Geben sie eine Zahl zum encrypten ein");
		// Scanner to get Input number to ecrypt it 
		Scanner numIntScannerEnc = new Scanner(System.in);
		int  k = numIntScannerEnc.nextInt();
		c = kryp.encrypt(k, e, N);
		System.out.println(c);
		
		System.out.println("Geben sie eine Zahl zum decrypten ein");
		// Scanner to get Input number to decrypt it 
		Scanner numIntScannerDec = new Scanner(System.in);
		c = numIntScannerDec.nextInt();
		k = kryp.encrypt(c, d, N);
		System.out.println(k);
	}

}
