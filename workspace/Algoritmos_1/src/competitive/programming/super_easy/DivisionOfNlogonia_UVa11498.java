package competitive.programming.super_easy;

import java.util.Scanner;

/**
 * 
 * Introduction competitive programming UVa 11498 lvl 1
 * 
 * @author Lux Ferre
 *
 */

public class DivisionOfNlogonia_UVa11498 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = "";
		int n = 0, m = 0;
		String[] arr;

		while (sc.hasNextLine()) {

			if (line.equals("0"))
				break;

			line = sc.nextLine();
			int cases = Integer.parseInt(line);

			arr = sc.nextLine().split(" ");
			n = Integer.parseInt(arr[0]);
			m = Integer.parseInt(arr[1]);

			for (int i = 0; i < cases; i++) {

				arr = sc.nextLine().split(" ");

				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);

				if (x > n && y > m) {
					System.out.println("NE");

				} else if (x == n || y == m) {
					System.out.println("divisa");

				} else if (x < n && y > m) {
					System.out.println("NO");

				} else if ((x > n && y < m)) {
					System.out.println("SE");

				} else {
					System.out.println("SO");
				}
			}
		}

		sc.close();
	}
}
