import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MiniRSA kryp = new MiniRSA();
		int e = 5;
		int N = 21;
		int d = 5;
		int c = 0;	
		
		System.out.println("Geben sie eine Zahl ein um die Einzelziffern zu encrypten");
		Scanner numIntobj = new Scanner(System.in);
		int numInt = numIntobj.nextInt();
		Crypto cryp = new Crypto(numInt); 
		
		System.out.println("Geben sie eine Zahl zum encrypten ein");
		Scanner numIntScannerEnc = new Scanner(System.in);
		int  k = numIntScannerEnc.nextInt();
		c = kryp.encrypt(k, e, N);
		System.out.println(c);
		
		System.out.println("Geben sie eine Zahl zum decrypten ein");
		Scanner numIntScannerDec = new Scanner(System.in);
		c = numIntScannerDec.nextInt();
		k = kryp.encrypt(c, d, N);
		System.out.println(k);
	}

}
