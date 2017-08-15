package competitive.programming.easy;

import java.util.Scanner;

public class LoansomeCarBuyer_UVa10114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = "";

		while (sc.hasNextLine()) {

			line = sc.nextLine();

			if (Integer.parseInt(line.split(" ")[0]) < 0)
				break;

			String[] arr = line.split(" ");

			int months = Integer.parseInt(arr[0]);
			double downPay = Double.parseDouble(arr[1]);
			double amount = Double.parseDouble(arr[2]);
			int recPercent = Integer.parseInt(arr[3]);
			double worth = 0;
			double cuotas = amount / months;
			double carValue = amount + downPay;

			String[] arr2 = sc.nextLine().split(" ");

			for (int i = 0; i < months; i++) {

				int monthPercent = Integer.parseInt(arr2[0]);
				double deprec = Double.parseDouble(arr2[1]);

				if (i == monthPercent) {
					double per = (carValue * (deprec * 100)) / 100;

					worth += per - downPay;

				} else {

				}

			}

		}

	}

}
