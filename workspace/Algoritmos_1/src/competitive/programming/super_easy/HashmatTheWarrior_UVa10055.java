package competitive.programming.super_easy;

import java.util.Scanner;

public class HashmatTheWarrior_UVa10055 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLong()) {
			
			// Cuidado con el fuera de rango de los tipos de datos
			
			long num1 = sc.nextLong();
			long num2 = sc.nextLong();

			if (num1 < num2) {
				System.out.println(Math.abs(num1 - num2));
			} else {
				System.out.println(num1 - num2);
			}

		}
		sc.close();
	}

}
