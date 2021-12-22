
public class Crypto {
	
	private int[] nomrmalArray;
	private int[] encryArray;
	private int[] decryArray;
	
	public Crypto(int dezi) {
		String s = String.valueOf(dezi);
		nomrmalArray = new int[s.length()];
		encryArray = new int[s.length()];
		decryArray = new int[s.length()];
		int e = 5;
		int N = 21;
		int d = 5;
		int count = 0;
		MiniRSA decEncDezObj = new MiniRSA();
		do {
		nomrmalArray[count] = dezi%10;
		dezi = dezi / 10;
		count++;
		}while(dezi>0);
		System.out.println("Encrypt");
		for(int i = 0;i<nomrmalArray.length;i++) {
		int k = nomrmalArray[i];
		encryArray[i] = decEncDezObj.encrypt(k, e, N);
		System.out.println(encryArray[i]);
		}
		System.out.println("\nDecrypt");
		for(int i = 0;i<nomrmalArray.length;i++) {
		int c = encryArray[i];
		decryArray[i] = decEncDezObj.decrypt(c, e, N);
		System.out.println(decryArray[i]);
		}
	}
}
