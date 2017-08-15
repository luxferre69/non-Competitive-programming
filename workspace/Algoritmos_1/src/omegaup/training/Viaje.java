package omegaup.training;

import java.util.Scanner;

/**
 * Problema "tu viaje está aqui" omegaup trainin'
 * 
 * @author Lux Ferre
 *
 */
public class Viaje {

	private static Scanner sc;

	public static void main(String[] args) throws Exception {

		sc = new Scanner(System.in);

		String cad1 = sc.next().toUpperCase();
		String cad2 = sc.next().toUpperCase();

		long res1 = getMult(cad1);
		long res2 = getMult(cad2);

		if ((res1 % 47) == (res2 % 47)) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
	}

	static long getMult(String cadena) {

		long mult = 1;

		for (int i = 0; i < cadena.length(); i++) {

			char c;
			for (int y = 0; y < 26; y++) {
				// obtener caracteres entre 'A' y 'Z'
				// se obtiene el correspondiente número de la letra y se hace el
				// cast a carácter (char)

				c = (char) ('A' + y % ('Z' - 'A' + 1));
				long pos = y + 1;

				if (Character.toString(c).equals(Character.toString(cadena.charAt(i))) && pos != 1) {
					mult = mult * pos;
				}
			}
		}
		return mult;
	}

}
