package competitive.programming.time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * 
 * 
 * @author Lux Ferre
 *
 */
public class ClockHands_UVa579 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		DecimalFormat decimalFormat = new DecimalFormat("0.000", symbols);

		while ((line = br.readLine()) != null && !line.equals("0:00")) {

			String[] vec = line.split(":");

			int hour = Integer.parseInt(vec[0]);
			int minute = Integer.parseInt(vec[1]);

			if (hour == 12) {
				hour = 0;
			}

			// formula obtenida en questtosolve.com
			double hHand = Math.abs(((hour * 30) + (minute / 2)) - (minute * 6));

			if (hHand > 180) {
				hHand = 360-hHand;
			}
			System.out.println(decimalFormat.format(hHand));
			
		}

		br.close();

	}

}
