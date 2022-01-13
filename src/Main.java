import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Objekt to get the encrypt function and the decrypte function
		MiniRSA kryp = new MiniRSA();
		// saves number in to c needs to initialize
		int c = 0;
		
		System.out.println("Geben sie eine Zahl ein um die Einzelziffern zu encrypten");
		// Input a number this number gets cut in its 
		Scanner numIntobj = new Scanner(System.in);
		String numInt = numIntobj.nextLine();
		// Creates an Objekt an gives am the Input number to cut up and enrypt and decrypt it 
		Crypto cryp = new Crypto(numInt); 
		
		System.out.println("Geben sie eine Zahl zum encrypten ein");
		// Scanner to get Input number to ecrypt it 
		Scanner numIntScannerEnc = new Scanner(System.in);
		int  k = numIntScannerEnc.nextInt();
		c = kryp.encrypt(k);
		System.out.println(c);
		
		System.out.println("Geben sie eine Zahl zum decrypten ein");
		// Scanner to get Input number to decrypt it 
		Scanner numIntScannerDec = new Scanner(System.in);
		c = numIntScannerDec.nextInt();
		k = kryp.decrypt(c);
		System.out.println(k);
	}

}
