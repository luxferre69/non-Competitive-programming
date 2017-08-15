package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Introducción ejemplo programación competitiva
 * 
 * @Author icesi
 */

public class OperadoresRelacionales {

	public static void main(String[] args) throws Exception {

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine();

		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			line = reader.readLine();
			String[] nums = line.split(" ");

			int one = Integer.parseInt(nums[0]);
			int two = Integer.parseInt(nums[1]);

			if (one > two) {
				writer.write(">\n");
			} else if (two > one) {
				writer.write("<\n");
			} else {
				writer.write("=\n");
			}
		}

		writer.close();
		reader.close();

	}

}
