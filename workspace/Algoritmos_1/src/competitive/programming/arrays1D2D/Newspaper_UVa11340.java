package competitive.programming.arrays1D2D;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.StringTokenizer;

/**
 * Implementación con Direct address table (DAT) genérico
 * (Slow) 
 * 
 * @author Lux Ferre
 *
 */
public class Newspaper_UVa11340 {

	private static int[] table;
	private static final int DEFAULT_CAPACITY = 127; // tamaño tabla ascii

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", symbols);

		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			line = br.readLine();
			int letters = Integer.parseInt(line);

			table = new int[DEFAULT_CAPACITY];

			for (int j = 0; j < letters; j++) {

				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);

				String key = st.nextToken();
				int value = Integer.parseInt(st.nextToken());

				int c = key.charAt(0);
				insert(c, value);
			}

			int numLines = Integer.parseInt(br.readLine());
			int sum = 0;

			while (numLines-- > 0) {

				String lines = br.readLine();

				for (int j = 0; j < table.length; j++) {

					if (get(j) != 0) {

						char letter = (char) j;
						int cont = 0;

						for (int k = 0; k < lines.length(); k++) {

							if (letter == lines.charAt(k)) {
								cont++;
							}
						}

						if (cont > 0) {
							sum += cont * get(j);
						}
					}
				}
			}
			System.out.println(df.format(sum / 100.0) + "$");
		}

		br.close();

	}

	public static void insert(int k, int d) {
		table[k] = d;
	}

	public static int get(int k) {
		return table[k];
	}

}
