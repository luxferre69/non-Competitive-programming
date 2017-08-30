package competitive.programming.adhoc.reallife.easier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 
 * @author Lux Ferre
 *
 */
public class BeatTheSpreed_UVa10812 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < cases; i++) {

			boolean isImpossible = false;
			StringTokenizer st = new StringTokenizer(br.readLine());

			long s = Long.valueOf(st.nextToken());
			long d = Long.valueOf(st.nextToken());

			if ((s % 2 == 0) && (d % 2 == 0) || (s % 2 != 0) && (d % 2 != 0)) { // si las dos son verdaderas o las dos son falsas
				isImpossible = true;
			}

			long firstScore = (s + d) / 2;
			long secScore = (s - d) / 2;

			if (secScore < 0 || !isImpossible) {
				bw.write("impossible");
			} else {
				bw.write(firstScore + " " + secScore);
			}
			bw.write("\n");
		}

		br.close();
		bw.close();
	}
}
