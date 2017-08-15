package competitive.programming.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author Lux Ferre
 *
 */
public class RequestForProposal_UVa10141 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int cont = 1;

		while ((line = br.readLine()) != null) {

			if (line.equals("0 0"))
				break;

			StringTokenizer str = new StringTokenizer(line);

			int requirements = Integer.parseInt(str.nextToken());
			int proposals = Integer.parseInt(str.nextToken());

			for (int i = 0; i < requirements; i++) {
				line = br.readLine();
			}

			int repeatReqMet = 0;
			double repeatPrice = 0;
			String name = "";

			for (int i = 0; i < proposals; i++) {

				line = br.readLine();
				StringTokenizer st = new StringTokenizer(br.readLine());

				double price = Double.parseDouble(st.nextToken());
				int requiMet = Integer.parseInt(st.nextToken());

				if (requiMet > repeatReqMet || (requiMet == repeatReqMet && price < repeatPrice)) {
					repeatReqMet = requiMet;
					name = line;
					repeatPrice = price;
				}

				for (int j = 0; j < requiMet; j++) {
					line = br.readLine();
				}
			}

			if (cont > 1) {
				System.out.println();
			}

			System.out.println("RFP #" + (cont++));
			System.out.println(name);

		}
		br.close();
	}
}
