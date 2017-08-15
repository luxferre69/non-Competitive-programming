package competitive.programming.super_easy;

import java.util.Scanner;

/**
 * Uva 10550
 * 
 * @author Lux Ferre
 *
 */

public class DialLock_UVa10550 {

	private final static int twoturn = 720;
	private final static int oneturn = 360;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String line = "";

		int init, a, b, c;

		while (sc.hasNextLine()) {

			line = sc.nextLine();

			String[] arr = line.split(" ");

			init = Integer.parseInt(arr[0]);
			a = Integer.parseInt(arr[1]);
			b = Integer.parseInt(arr[2]);
			c = Integer.parseInt(arr[3]);
			
			int suma = 0;

			if (init == 0 && a == 0 && b == 0 && c == 0)
				break;

			// 3 vueltas siempre
			suma += (twoturn + oneturn);

			// primer giro
			if (init < a) {
				suma += (40 - a + init) * 9;
			} else {
				suma += (init - a) * 9;
			}

			// segundo giro inverso
			if (a > b) {
				suma += (40 - a + b) * 9;
			} else {
				suma += (b - a) * 9;
			}

			// 3 giro clockwise
			if (b < c) {
				suma += (40 - c + b) * 9;
			} else {
				suma += (b - c) * 9;
			}
			
			System.out.println(suma);
			
			
		}
	}

}
