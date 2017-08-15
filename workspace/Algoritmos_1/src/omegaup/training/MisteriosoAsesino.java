package omegaup.training;

import java.util.Scanner;

/**
 * Misterioso Asesino de la celda 5 - omega up trainin
 * 
 * v.0.0 Con recorrido manual de toda la matriz
 * 
 * @author Lux Ferre
 *
 */
public class MisteriosoAsesino {

	private static Scanner sc;
	private static int largo;
	private static int ancho;
	private static int[][] cuarto;
	private static int[] cama;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		largo = sc.nextInt();
		ancho = sc.nextInt();

		cama = new int[4]; // 2*2
		cuarto = new int[largo][ancho];

		int lugares = sc.nextInt();

		for (int i = 0; i < lugares; i++) {

			int coordenadaA = sc.nextInt();
			int coordenadaB = sc.nextInt();

			cuarto[coordenadaA - 1][coordenadaB - 1] = 1;
		}

		System.out.println(mystery());
	}

	public static int mystery() {

		int contCol = 2, contPos = 0, contFil = 0, aux = 0;

		for (int i = 0; i < largo; i++) {
			for (int j = contFil; j < contCol; j++) {
				cama[contPos] = cuarto[i][j];
				contPos++;
			}

			if (i == largo - 1 && contCol < ancho) {
				i = 0;
				contFil++;
				contCol++;
			}

			if (contPos == 4) {
				int acum = 0;
				for (int j = 0; j < cama.length; j++) {
					acum += cama[j];
				}

				if (acum == 0) {
					aux++;
				}

				i--;
				contPos = 0;
			}
		}
		return aux;
	}

}
