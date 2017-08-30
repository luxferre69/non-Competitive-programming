package competitive.programming.adhoc.reallife.easier;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Lux Ferre
 *
 */
public class Wertyu_UVa10082 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String let = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			for (int i = 0; i < line.length(); i++) {

				if (String.valueOf(line.charAt(i)).equals(" ")) {
					System.out.print(" ");
				}

				for (int j = 0; j < let.length(); j++) {

					if (String.valueOf(line.charAt(i)).equals(String.valueOf(let.charAt(j)))) {
						System.out.print(let.toCharArray()[j - 1]);
					}
				}
			}
			System.out.println();
		}
		br.close();
	}

}
