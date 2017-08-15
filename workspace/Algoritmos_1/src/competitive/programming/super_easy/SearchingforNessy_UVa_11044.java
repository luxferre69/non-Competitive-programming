package competitive.programming.super_easy;

import java.util.Scanner;

/**
 * UVa 11044
 * 
 * @author Lux Ferre
 *
 */

public class SearchingforNessy_UVa_11044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			String[] arr = sc.nextLine().split(" ");

			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);

			int m = (a / 3) * (b / 3);

			System.out.println(m);

		}

		sc.close();

	}

}
