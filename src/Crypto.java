
public class Crypto {
	
	private int[] nomrmalArray;
	private int[] encryArray;
	private int[] decryArray;
	
	public Crypto(int dezi) {
		// writes the integer number in a String
		String s = String.valueOf(dezi);
		// sets the length of the array to the length of the string
		nomrmalArray = new int[s.length()];
		encryArray = new int[s.length()];
		decryArray = new int[s.length()];
		// Public Key to encrypt the numbers 
		int e = 5;
		// Number for the modulus to encrypt
		int N = 21;
		// Private Key to decrypt the number
		int d = 5;
		// Variable to count up save in an Element for the array  
		int count = 0;
		// Object to encrypt an to decrypt 
		MiniRSA decEncDezObj = new MiniRSA();
		do {
		// splits the number in singel Elemenst and than saves in an array z.B the number 123 is than 1/2/3
		nomrmalArray[count] = dezi%10;
		// changes dezi and if not zero continue 
		dezi = dezi / 10;
		// increas count by on to change where you save in the array
		count++;
		// continue until the number is zero
		}while(dezi>0);
		System.out.println("Encrypt");
		// loop to encrypt the numbers and saves it in an enrypt array
		for(int i = 0;i<nomrmalArray.length;i++) {
		// saves the number in the array on the position zero up in an variable   
		int k = nomrmalArray[i];
		// encrypt the number and saves it in the encrypt array
		encryArray[i] = decEncDezObj.encrypt(k, e, N);
		System.out.println(encryArray[i]);
		}
		System.out.println("\nDecrypt");
		// loop to decrypt the numbers and saves it in an derypt array
		for(int i = 0;i<nomrmalArray.length;i++) {
		// saves the number in the array on the position zero up in an variable  	
		int c = encryArray[i];
		// decrypt the number and saves it in the decrypt array
		decryArray[i] = decEncDezObj.decrypt(c, e, N);
		System.out.println(decryArray[i]);
		}
	}
}
