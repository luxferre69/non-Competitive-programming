package competitive.programming.adhoc.palindromes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MotherBear_UVa10945 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.equals("DONE")) {

			char c[] = line.toCharArray();
			StringBuilder nueva = new StringBuilder();

			for (int i = 0; i < c.length; i++) {
				if (c[i] != ' ' && c[i] != ',' && c[i] != '.' && c[i] != '!' && c[i] != '?') {
					nueva.append(String.valueOf(c[i]));
				}
			}

			if (isPalindrome(nueva.toString())) {
				System.out.println("You won't be eaten!");
			} else {
				System.out.println("Uh oh...");
			}
		}
		br.close();
	}

	private static boolean isPalindrome(String palabra) {

		boolean esPalindromo = false;

		for (int i = 0; i < palabra.length(); i++) {
			char init = palabra.charAt(i);
			char last = palabra.charAt(palabra.length() - (i + 1));
			if (String.valueOf(init).equalsIgnoreCase(String.valueOf(last))) {
				esPalindromo = true;
			} else {
				esPalindromo = false;
				break;
			}
		}
		return esPalindromo;
	}

}
