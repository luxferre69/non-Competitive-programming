package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Ejercicio B "Las esferas del dragón" - Maratón de programación 11 CCC
 * 
 * @author Lux Ferre
 *
 */

public class Esferas {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("esferas.in");

		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			String[] vec = reader.readLine().split(" ");

			int fil = Integer.parseInt(vec[0]);
			int col = Integer.parseInt(vec[1]);
			int numEsferas = Integer.parseInt(vec[2]);

			String[][] mat = new String[fil][col];

			for (int x = 0; x < numEsferas; x++) {

				String[] coord = reader.readLine().split(" ");
				int coordFil = Integer.parseInt(coord[0]);
				int coordCol = Integer.parseInt(coord[1]);

				mat[coordFil][coordCol] = "O";
			}

			for (int j = 0; j < mat.length; j++) {

				imprimeSeparador(col);

				for (int j2 = 0; j2 < mat[j].length; j2++) {

					System.out.print("+");
					if (mat[j][j2] == null) {
						mat[j][j2] = " ";
					}
					System.out.print(mat[j][j2]);
				}
				System.out.print("+");
				System.out.println();
			}
			imprimeSeparador(col);
			System.out.println();
		}

		reader.close();
	}

	private static void imprimeSeparador(int col) {
		for (int i = 0; i < 2 * col + 1; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}
