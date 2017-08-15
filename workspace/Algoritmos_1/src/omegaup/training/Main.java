package omegaup.training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int c = sc.nextInt();
		int q = sc.nextInt();

		int[] pp = { p, c, q };

		int contPizza = 0;
		int sobra = 0;

		for (int i = pp.length - 1; i >= 0; i--) {

			int aux = pp[i];

			int pizza = 4;

			for (int j = 0; j < pp[i]; j++) {

				if (i == 0 && aux != 0) {

					// 1/4

					if (j == 0) {
						j += sobra;
					}

					pizza--;

					if (pizza == 0 || j + 1 == aux) {
						contPizza++;
						pizza = 4;
					}

				} else if (i == 1 && aux != 0) {

					// 2/4
					pizza -= 2;

					if (pizza == 0 || j + 1 == aux) {
						contPizza++;
						sobra += pizza;
						pizza = 4;
					}

				} else if (i == 2 && aux != 0) {

					// 3/4
					pizza -= 3;

					if (pizza == 1) {
						contPizza++;
						sobra += pizza;
						pizza = 4;
					}
				}
			}
		}

		System.out.println(contPizza);
		sc.close();
	}

}
