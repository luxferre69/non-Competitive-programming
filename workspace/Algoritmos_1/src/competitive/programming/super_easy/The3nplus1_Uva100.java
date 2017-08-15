package competitive.programming.super_easy;

import java.util.Scanner;

/**
 * 
 * @author Lux Ferre
 *
 */
public class The3nplus1_Uva100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int x, y;

			if (n > m) {
				x = m;
				y = n;
			} else {
				x = n;
				y = m;
			}

			int acum = 0;
			for (int i = x; i <= y; i++) {
				acum = Math.max(acum, tresnmasuno(i));
			}
			System.out.println(n + " " + m + " " + (acum + 1));
		}
		sc.close();
	}

	static int tresnmasuno(int n) {

		int cont = 0;
		while (true) {

			if (n == 1)
				break;

			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			cont++;
		}
		return cont;
	}

}
