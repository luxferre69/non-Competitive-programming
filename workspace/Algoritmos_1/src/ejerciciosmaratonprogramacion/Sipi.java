package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.unicomfacauca.estructurasdedatos.algoritmos.ordenamiento.Sort;

/**
 * Ejercicio C "Sipi" - Maratón de programación 11 CCC
 * 
 * @author Lux Ferre
 *
 */
public class Sipi {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 1era linea
		String line = reader.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			// 2da linea
			line = reader.readLine();

			int num = Integer.parseInt(line);
			int[] vec = new int[num];

			// 3era linea
			String[] split = reader.readLine().split(" ");

			for (int j = 0; j < split.length; j++) {
				vec[j] = Integer.parseInt(split[j]);
			}

			// Nuevo para JRE 8
			/**
			 * int[] arr = Arrays.stream(reader.readLine().split(" "))
			 * .map(String::trim).mapToInt(Integer::parseInt).toArray();
			 * System.out.println(Arrays.toString(arr));
			 **/

			// Ordena el vector descendentemente
			Sort.bubbleSortMethodDesc(vec);

			boolean isSipi = false;
			int pos1 = 0, pos2 = 0;

			for (int x = 1; x < vec.length; x++) {
				if ((vec[x - 1] - vec[x]) > 10) { // Verifica la diferencia
					pos1 = x - 1;
					pos2 = x;
					isSipi = true;
					break;
				}
			}

			if (isSipi) {
				System.out.println(pos1 + " " + pos2);
			} else {
				System.out.println("sipi");
			}
		}
		
		reader.close();

	}
}
