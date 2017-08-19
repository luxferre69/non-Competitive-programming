package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.unicomfacauca.estructurasdedatos.algoritmos.ordenamiento.ArrayUtil;

/**
 * Ejercicio D "Orden" Riot Points - Maratón de programación 11 CCC
 * 
 * @author Lux Ferre
 *
 */
public class RiotPoints {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 1era linea
		String line = reader.readLine();
		int cases = Integer.parseInt(line);
		int[] peso = new int[cases];
		String[] letra = new String[cases];

		while (cases > 0) {

			String[] split = reader.readLine().split(" ");

			for (int i = 0; i < cases; i++) {
				// Separación de vectores de pesos y letras para posterior uso
				letra[i] = split[0]; // Letras
				peso[i] = Integer.parseInt(split[1]); // pesos
			}

			cases--;

			if (cases == 0) {
				line = reader.readLine();
			}
		}

		String[] letters = line.split("");
		System.out.println("Cadena a ordenar : " + line);

		/**
		 * Asignación de pesos que varia según la cadena que se de a ordenar
		 */
		int[] newWeight = new int[peso.length];

		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letra.length; j++) {
				if (letters[i].equals(letra[j])) {
					// Asigna peso
					System.out.println("Peso de " + letters[i] + " -> " + peso[j]);

					// Nuevo orden de pesos
					newWeight[i] = peso[j]; 
				}
			}
		}
		
		/**
		 * Con el nuevo orden se ordena el array de pesos y 
		 *  asigna posición a la letra 
		 */
		for (int i = 0; i < newWeight.length; i++) {
			for (int j = (i + 1); j < newWeight.length; j++) {
				int elementoComparar = newWeight[i];
				String element = letters[i];
				if (elementoComparar < newWeight[j]) {
					
					//Burbuja descendente -- si es menor intercambia pos con el mayor
					newWeight[i] = newWeight[j];
					newWeight[j] = elementoComparar;
					
					// Intercambia la letra según la condición del peso
					letters[i] = letters[j]; 
					letters[j] = element;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("Orden: ");
		ArrayUtil.imprimirVector(newWeight);

		for (int i = 0; i < letters.length; i++) {
			System.out.print(" " + letters[i]);
		}
		System.out.println();

		reader.close();
	}

}
