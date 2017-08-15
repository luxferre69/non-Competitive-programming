package competitive.programming.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 
 * 
 * @author Lux Ferre
 *
 */
public class EcologicalPremium_UVa10300 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = br.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			line = br.readLine();
			int farmers = Integer.parseInt(line);
			long sum = 0;
			
			for (int j = 0; j < farmers; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				long size = Long.valueOf(st.nextToken());
				long animals = Long.valueOf(st.nextToken());
				long friendly = Long.valueOf(st.nextToken());

				long totalPremium = (size * animals * friendly) / animals;
				sum+=totalPremium;
			}
			bw.write(sum + "\n");
		}
		bw.close();
		br.close();

	}

}
