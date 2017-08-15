package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Uva 12243
 * 
 * @author Lux Ferre
 *
 */
public class Tautograma {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = reader.readLine();
		boolean flag = false;

		while (!line.equals("*")) {

			String firstLetter = line.substring(0, 1);
			String[] words = line.split(" ");

			for (int j = 0; j < words.length; j++) {

				if (words[j].startsWith(firstLetter.toUpperCase()) || 
						words[j].startsWith(firstLetter.toLowerCase())) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if (flag) {
				writer.write("Y\n");
			} else {
				writer.write("N\n");
			}
			
			line = reader.readLine();
		}

		writer.close();
		reader.close();

	}

}
