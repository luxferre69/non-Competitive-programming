
package competitive.programming.adhoc.games;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Minesweeper_UVa10189 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;

		while ((line = br.readLine()) != null && !line.equals("0 0")) {

			StringTokenizer st = new StringTokenizer(line);
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			String[][] mines = new String[m][n];
			int[][] res = new int[m][n];

			for (int i = 0; i < mines.length; i++) {
				line = br.readLine();
				String[] vec = line.split("");

				for (int j = 0; j < mines[i].length; j++) {

					mines[i][j] = vec[j];

				}
			}

			for (int i = 0; i < mines.length; i++) {
				for (int j = 0; j < mines[i].length; j++) {

					if (i == 0 && j == 0 && mines[i][j].equals("*")) {
						// si está en el borde izquiero superior
						res[i + 1][j]++;
						res[i + 1][j + 1]++;
						res[i][j + 1]++;

					}
					
				}
			}

			System.out.println();
			for (int i = 0; i < mines.length; i++) {
				for (int j = 0; j < mines[i].length; j++) {

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
		bw.close();
	}

}