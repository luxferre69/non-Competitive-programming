package omegaup.training;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * Pizzas - OMI trainin' gate
 * 
 * @author Lux Ferre
 * 29/06/17
 *
 */
public class Pizzas {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int contPizza = 0;
		int sobra = 0;

		for (int i = 2; i >= 0; i--) {

			String[] num = line.split(" ");

			int aux = Integer.parseInt(num[i]);

			int pizza = 4;

			for (int j = 0; j < aux; j++) {

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

		System.out.println("Número de pizzas: " + contPizza);
		br.close();
	}
}
