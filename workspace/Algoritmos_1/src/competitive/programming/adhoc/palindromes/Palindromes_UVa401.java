package competitive.programming.adhoc.palindromes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * 
 * @author Lux Ferre
 *
 */
public class Palindromes_UVa401 {

	private static final char[] character = { 'A', 'E', 'H', 'I', 'J', 'L', 'M', 'O', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
			'Z', '1', '2', '3', '5', '8' };

	private static final char[] reverse = { 'A', '3', 'H', 'I', 'L', 'J', 'M', 'O', '2', 'T', 'U', 'V', 'W', 'X', 'Y',
			'5', '1', 'S', 'E', 'Z', '8' };

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {

			if (line.isEmpty())
				break;

			if (isPalindrome(line) && isMirroredString(line)) {
				System.out.println(line + " -- is a mirrored palindrome.");

			} else if (!isPalindrome(line) && isMirroredString(line)) {
				System.out.println(line + " -- is a mirrored string.");

			} else if (isPalindrome(line) && !isMirroredString(line)) {
				System.out.println(line + " -- is a regular palindrome.");

			} else {
				System.out.println(line + " -- is not a palindrome.");
			}
			System.out.println();
		}
		br.close();

	}

	private static boolean isMirroredString(String palabra) {

		boolean esMirroredString = false;

		for (int i = 0; i < palabra.length(); i++) {
			char init = palabra.charAt(i);
			char last = palabra.charAt(palabra.length() - (i + 1));

			int aux = 0;
			for (int j = 0; j < character.length; j++) {
				int pos = 0;
				if (init == character[j]) {
					pos = j;
					if (last == reverse[pos]) {
						esMirroredString = true;
					} else {
						return esMirroredString = false;
					}
					aux++;
				}
			}
			if (aux == 0) {
				return esMirroredString = false;
			}
		}
		return esMirroredString;
	}

	private static boolean isPalindrome(String palabra) {

		boolean esPalindromo = false;

		for (int i = 0; i < palabra.length(); i++) {
			char init = palabra.charAt(i);
			char last = palabra.charAt(palabra.length() - (i + 1));
			if (init == last) {
				esPalindromo = true;
			} else {
				esPalindromo = false;
				break;
			}
		}
		return esPalindromo;
	}

}
