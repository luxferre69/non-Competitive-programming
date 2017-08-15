package competitive.programming.super_easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEXQuotes_UVa00272 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cont = 0;
		String linea;
		while ((linea = br.readLine()) != null) {

			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) == '"') {
					
					if (cont % 2 == 0) {
						System.out.print("``");

					} else {
						System.out.println("''");
					}

					cont++;

					// p = linea.replace('"', (char) 39);
					// p = linea.replaceFirst("\"", "``");

				} else {
					System.out.print(linea.charAt(i));
				}
			}
			// System.out.println(p);
		}
		br.close();
	}

}
