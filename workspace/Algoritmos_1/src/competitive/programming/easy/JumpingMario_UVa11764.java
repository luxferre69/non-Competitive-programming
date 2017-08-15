package competitive.programming.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Lux Ferre
 *
 */
public class JumpingMario_UVa11764 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = br.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			line = br.readLine();
			int high = 0;
			int low = 0;

			String[] height = br.readLine().split(" ");

			for (int k = 1; k < height.length; k++) {
				int a = Integer.parseInt(height[k - 1]);
				int b = Integer.parseInt(height[k]);

				if (a < b) {
					high++;
				} else if (a > b) {
					low++;
				}
			}

			bw.write("Case " + (i + 1) + ": " + high + " " + low + "\n");

		}
		bw.close();
		br.close();

	}

}
