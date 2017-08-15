package competitive.programming.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * UVa 11799
 * 
 * @author Lux Ferre
 *
 */
public class HorrorDash_UVa11799 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String newLine = br.readLine();
			String[] student = newLine.split(" ");
			int n = Integer.parseInt(student[0]);
			int max = 0;
			// el arreglo student contiene todos los datos de entrada junto con salto de linea
			// ej: 20 30 56 63
			//		36 86 985
			for (int j = 1; j <= n; j++) {
				int s = Integer.parseInt(student[j]);
				max = Math.max(max, s);
			}
			System.out.println("Case " + (i + 1) + ": " + max);
		}

		br.close();

	}

}
