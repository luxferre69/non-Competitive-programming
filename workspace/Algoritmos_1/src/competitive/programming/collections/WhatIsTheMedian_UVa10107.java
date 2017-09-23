package competitive.programming.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Launch unknown Runtime error on uva judge
 * 
 * @author Lux Ferre
 *
 */
public class WhatIsTheMedian_UVa10107 {

	public static void main(String[] args) throws Exception {

		String line;
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		long n = 0;
		ArrayList<Long> median = new ArrayList<Long>();

		while ((line = fr.readLine()) != null) {

			if (line.isEmpty()) {
				break;
			}

			n = Long.valueOf(line);

			median.add(n);

			Collections.sort(median);

			long mediana = 0;

			// Fórmulas por defecto para obtener la mediana
			if (median.size() % 2 == 0 && median.size() > 1) { // si es par

				mediana = (median.get((median.size() - 1) / 2) + median.get(median.size() / 2)) / 2;
			} else {
				mediana = median.get((median.size() - 1) / 2); // si es impar
			}

			System.out.println(mediana);
		}
		fr.close();
	}

}
