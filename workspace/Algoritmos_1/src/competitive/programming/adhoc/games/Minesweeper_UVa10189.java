
package competitive.programming.adhoc.games;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minesweeper_UVa10189 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int t = 0;

		while ((line = br.readLine()) != null && !line.equals("0 0")) {

			StringTokenizer st = new StringTokenizer(line);
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			String[][] mines = new String[m + 2][n + 2];
			int[][] res = new int[m + 2][n + 2];

			for (int i = 1; i <= m; i++) {
				line = br.readLine();
				String[] vec = line.split("");

				for (int j = 1; j <= n; j++) {

					mines[i][j] = vec[j - 1];

				}
			}

			for (int i = 0; i < m + 2; i++) {
				for (int j = 0; j < n + 2; j++) {

					if (mines[i][j] != null) {

						if (mines[i][j].equals("*")) {

							// ocho posiciones
							res[i - 1][j - 1]++;
							res[i - 1][j]++;
							res[i - 1][j + 1]++;
							res[i][j - 1]++;
							res[i][j + 1]++;
							res[i + 1][j - 1]++;
							res[i + 1][j]++;
							res[i + 1][j + 1]++;

						}
					}

				}
			}
			
			if (t > 0) {
				System.out.println();
			}
			System.out.println("Field #" + (++t) + ":");

			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {

					if (mines[i][j].equals("*")) {
						System.out.print("*");
					} else {
						System.out.print(res[i][j]);
					}
				}
				System.out.println();
			}
		}

		br.close();
	}
}