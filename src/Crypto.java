
public class Crypto {

	private int[] normalArray;
	private int[] encryArray;
	private int[] decryArray;

	public Crypto(String dezi) {
		// writes the integer number in a String
		// sets the length of the array to the length of the string
		normalArray = new int[dezi.length()];
		encryArray = new int[dezi.length()];
		decryArray = new int[dezi.length()];

		// Variable to count up save in an Element for the array
		int count = 0;
		// Object to encrypt an to decrypt
		MiniRSA decEncDezObj = new MiniRSA();
		
		// foor loop to cut up the String
		for (int i = 0; i < dezi.length(); i++) {
			// changes char to int and saves in array
			normalArray[i] = Character.getNumericValue(dezi.charAt(i));
		}

		System.out.println("Encrypt");
		// loop to encrypt the numbers and saves it in an enrypt array
		for (int i = 0; i < normalArray.length; i++) {
			// saves the number in the array on the position zero up in an variable
			int k = normalArray[i];
			// encrypt the number and saves it in the encrypt array
			encryArray[i] = decEncDezObj.encrypt(k);
			System.out.println(encryArray[i]);
		}
		System.out.println("\nDecrypt");
		// loop to decrypt the numbers and saves it in an derypt array
		for (int i = 0; i < normalArray.length; i++) {
			// saves the number in the array on the position zero up in an variable
			int c = encryArray[i];
			// decrypt the number and saves it in the decrypt array
			decryArray[i] = decEncDezObj.decrypt(c);
			System.out.println(decryArray[i]);
		}
	}
}
