package competitive.programming.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * Uva 11559 Event Planning
 * 
 * @author Lux Ferre
 *
 */
public class EventPlanning {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while (true) {

			line = br.readLine();

			if (line == null || line.isEmpty())
				break;

			String[] arr = line.split(" ");

			int numHuesp = Integer.parseInt(arr[0]);
			int budget = Integer.parseInt(arr[1]);
			int hoteles = Integer.parseInt(arr[2]);
			int weeks = Integer.parseInt(arr[3]);
			int price = 0;
			int[] temp = new int[hoteles];

			String[] beds = new String[weeks];

			for (int i = 0; i < hoteles; i++) {

				int precio = Integer.parseInt(br.readLine());
				beds = br.readLine().split(" ");

				for (int j = 0; j < beds.length; j++) {

					int bedWeek = Integer.parseInt(beds[j]);

					if (bedWeek >= numHuesp) {

						price = precio * numHuesp;
						temp[i] = price;
					}
				}
			}

			Arrays.sort(temp);

			int currentPrice = 0;
			for (int i = 0; i < temp.length; i++) {

				if (temp[i] != 0) {
					currentPrice = temp[i];
					break;
				}
			}

			if (currentPrice < budget && currentPrice != 0) {
				System.out.println(currentPrice);
			} else {
				System.out.println("stay home");
			}
		}

		br.close();

	}
}