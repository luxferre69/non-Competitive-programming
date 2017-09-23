package competitive.programming.arrays1D2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Solución con ordenamiento y comparación
 * UVa 10038
 * @author Lux Ferre
 *
 */
public class JollyJumpers_UVa10038 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {

			if (line.isEmpty()) {
				break;
			}

			StringTokenizer st = new StringTokenizer(line);

			int n = Integer.parseInt(st.nextToken());
			int[] sec = new int[n];
			int[] diff = new int[n - 1];

			for (int i = 0; i < sec.length; i++) {
				sec[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 1; i <= diff.length; i++) {
				diff[i - 1] = Math.abs(sec[i - 1] - sec[i]);
			}

			Arrays.sort(diff);

			boolean flag = true;

			for (int i = 1; i < n; i++) {

				if (diff[i - 1] != i) {
					System.out.println("Not jolly");
					flag = false;
					break;
				}
			}

			if (flag || n == 1) {
				System.out.println("Jolly");
			}
		}

		br.close();

	}

}
