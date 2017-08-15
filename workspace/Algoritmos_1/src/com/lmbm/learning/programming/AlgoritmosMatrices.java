package com.lmbm.learning.programming;

import java.util.Random;
import java.util.Scanner;

public class AlgoritmosMatrices {

	public static void main(String[] args) {

		// Declaración matriz 4 * 4
		int[][] matriz;
		int[][] matriz2;

		// Instancia clase Scanner, llama a constructor Scanner q recibe un
		// inputstream estatico
		// de la clase System
		Scanner lect = new Scanner(System.in);

		Random random = new Random();

		int fila, col;
		int mayor = 0;
		int repeat = 0;

		System.out.println("Ingrese el número de filas : ");
		fila = lect.nextInt();

		System.out.println("Ingrese el número de Columnas : ");
		col = lect.nextInt();

		// Se crea la matriz con los valores especificados
		matriz = new int[fila][col];
		System.out.println("tamaño matriz " + matriz.length);
		matriz2 = new int[fila][col];

		// Ciclo general que lee una matriz de m x n
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				// System.out.println("Ingrese un número en la fila :" + i + "
				// columna: " + j);
				int numeroAleatorio = (int) (Math.random() * 100 + 1); // Para
																		// generar
																		// número
																		// aleatorios
																		// entre
																		// 1 y
																		// 100;
				matriz[i][j] = numeroAleatorio;
			}
		}

		// Para Imprimir la matriz
		for (int i = 0; i < fila; i++) {
			System.out.println("");
			for (int j = 0; j < col; j++) {
				System.out.print(" " + matriz[i][j]);
			}
		}
		System.out.println("");

		// System.out.println("");
		// System.out.println("Siguiente matriz");
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// System.out.println("Ingrese un número en la fila :" + i + " columna:
		// " + j);
		// matriz2[i][j] = lect.nextInt();
		// }
		// }
		// 1. Leer una matriz 4x4 entera y determinar en qué fila y en qué
		// columna se encuentra el número
		// mayor.
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz.length; j++) {
		// System.out.println(matriz[i][j] + " -- " + matriz[fila][col]);
		// if (matriz[i][j] > matriz[fila][col]) {
		// mayor = matriz[i][j];
		// fila = i;
		// col = j;
		// }
		// }
		// }
		//
		// //2. Leer una matriz 4x4 entera y determinar cuántas veces se repita
		// en ella el número mayor
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz.length; j++) {
		// if (mayor == matriz[i][j]) {
		// repeat++;
		// }
		// }
		// }
		// System.out.println("El número mayor es " +mayor+
		// " y se encuentra en la fila " + fila + " y columna " + col + "y se
		// repite " +repeat+ " veces");
		// 3. Leer una matriz 3x4 entera y determinar en qué posiciones exactas
		// se encuentran los números pares.
		// int row = 0;
		// int column = 0;
		//
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz.length; j++) {
		// if (matriz[i][j] % 2 == 0) { // Para saber si es par
		// int par = matriz[i][j];
		// System.out.println("El número >> " +par+ " se encuentra en la fila "
		// +i+ ", columna " +j);
		// }
		// }
		// }
		// 4. Leer una matriz 4x3 entera y determinar en qué posiciones exactas
		// se encuentran los números primos.
		// for (int i = 0; i < fila ; i++) {
		// for (int j = 0; j < col; j++) {
		// if (AlgoritmosArreglos.esPrimo(matriz[i][j])) { // Llamada a método
		// estático "esPrimo" que verifica si un número es primo o no
		// System.out.println("El número >> " +matriz[i][j]+
		// " es primo y se encuentra en la fila: " +i+ " columna: " +j);
		// }
		// }
		// }
		// 5. Leer una matriz 4x3 entera, calcular la suma de los elementos de
		// cada fila y determinar cuál es
		// la fila que tiene la mayor suma.
		// int[] vecSum;
		// vecSum = new int[4];
		// int sum = 0;
		// int cont = 0;
		// int sumMayor = 0;
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (i == cont) {
		// sum = sum + matriz[i][j];
		// }
		// }
		// System.out.println("La suma de la fila " + (i + 1) + " es: " + sum);
		// vecSum[i] = sum; // Se almacenan las sumas en un vector para saber
		// cual es el mayor
		// sum = 0; // Se reinicia el valor de suma para almacenar el nuevo
		// valor
		// cont++; // contador de filas
		// }
		//
		// for (int i = 0; i < vecSum.length; i++) {
		// if (vecSum[i] > vecSum[sumMayor] ) { // Condición si encuentra
		// algún número mayor que el anterior
		// System.out.println("Entra>> " +i);
		// sumMayor = i;
		// }
		// }
		// System.out.println("La suma mayor es >> " +vecSum[sumMayor]);
		// 6. Leer una matriz 4x4 entera y calcular el promedio de los números
		// mayores de cada fila.
		// int sum = 0;
		// int cont = 0;
		// int sumMayor = 0;
		// int c = 0;
		// int pro = 0;
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (i == cont) {
		// if (matriz[i][j] > matriz[sumMayor][c]) {
		// sumMayor = i;
		// c = j;
		// }
		// }
		// }
		// System.out.println("mayor fila " +(i+1)+ " es: "
		// +matriz[sumMayor][c]);
		// sum = sum + matriz[sumMayor][c];
		// pro = sum/matriz.length;
		// System.out.println("El promedio de los elementos mayores de cada fila
		// es " +pro);
		// sumMayor = 0;
		// c = 0;
		// cont++; // contador de filas
		// }
		// 7. Leer una matriz 4x4 entera y determinar en qué posiciones están
		// los enteros terminados en 0.
		// 8. Leer una matriz 4x4 entera y determinar cuántos enteros
		// terminados en 0 hay almacenados en ella.
		// int cont = 0;
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (matriz[i][j] % 10 == 0) {
		// System.out.println(matriz[i][j]+ " Termina en 0 " +
		// " fila: " +(i+1)+ " columna: " +(j+1));
		// cont++;
		// System.out.println("Hay " +cont+ " enteros terminados en 0");
		// }
		// }
		// }
		// 9. Leer una matriz 3x4 entera y determinar cuántos de los números
		// almacenados son primos y terminan en 3.
		// int cont = 0;
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (AlgoritmosArreglos.esPrimo(matriz[i][j]) && matriz[i][j] % 3 ==
		// 0) { // Llamada a método estático "esPrimo" que verifica si un
		// número es primo o no
		// cont++;
		// }
		// }
		// }
		// 10. Leer una matriz 5x3 entera y determinar en qué fila está el
		// mayor número primo.
		// boolean primo = false;
		// int cont = 0;
		// int sumMayor = 0;
		// int c = 0;
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (i == cont && AlgoritmosArreglos.esPrimo(matriz[i][j])) {
		// if (matriz[i][j] > matriz[sumMayor][c]) {
		// sumMayor = i;
		// c = j;
		// primo = true;
		// }
		// }
		// }
		// cont++; // contador de filas
		// }
		// for(int[] arr2: array1)
		// {
		// for(int val: arr2)
		// System.out.print(val);
		// }
		// 11. Leer una matriz 5x3 entera y determinar en qué columna está el
		// menor número par.
		// boolean par = false;
		// int menorf = 0;
		// int menorC = 0;
		// int aux = 0;
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz[i].length; j++) {
		// if (matriz[i][j] % 2 == 0) { // Comprueba si es par
		// par = true;
		// if (aux == 0) { // Variable auxiliar que asigna una sola vez el
		// primer valor par
		// menorf = i; // Se asignan las posiciones pares (Fila)
		// menorC = j; // (Columna)
		// }
		// aux = 1;
		// if (matriz[i][j] < matriz[menorf][menorC]) { // Se compara si es
		// menor EJ (2 < 2) (1 < 2)
		// menorf = i; // entra --> se pasan las posiciones y quedan las del
		// menor (fila)
		// menorC = j; // (columna)
		// }
		// }
		// }
		// }
		// if (par) { // Para imprimir solo si existen números pares
		// System.out.println("el menor es >> " + matriz[menorf][menorC]
		// + " fila: " + menorf + " columna: " + menorC);
		// } else {
		// System.out.println("No hay pares en la matriz");
		// }
		// 13. Leer una matriz 5x3 entera y determinar en qué columna está el
		// mayor número que comienza con el dígito 4.
		// int mayorF = 0;
		// int mayorC = 0;
		// int aux = 0;
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz[i].length; j++) {
		// int numero = matriz[i][j];
		//
		// while (numero != 0) {
		// numero = numero / 10;
		// if (numero == 4) {
		// if (aux == 0) {
		// mayorF = i;
		// mayorC = j;
		// aux = 1;
		// }
		// System.out.println(matriz[i][j] + " -- " + matriz[mayorF][mayorC]);
		// if (matriz[i][j] > matriz[mayorF][mayorC]) {
		// mayorF = i;
		// mayorC = j;
		// }
		// }
		// }
		// }
		// }
		// System.out.println("Número " + matriz[mayorF][mayorC] + " "
		// + "es el mayor y empieza en 4, en la fila " + mayorF + " columna " +
		// mayorC);
		// 19. Leer dos matrices 4x5 entera y determinar si sus contenidos son
		// exactamente iguales.
		// boolean equal = false;
		// for (int i = 0; i < matriz.length; i++) {
		// for (int j = 0; j < matriz[i].length; j++) {
		// System.out.println(matriz[i][j] + " -- " + matriz2[i][j]);
		// if (matriz[i][j] == matriz2[i][j]) {
		// equal = true;
		// }else{
		// equal = false;
		// break;
		// }
		// }
		// }
		// if (equal) {
		// System.out.println("Las matrices son iguales");
		// }else{
		// System.out.println("Las matrices no son iguales");
		// }
		// Vector esquinas de una matriz n * m
		// int[] vecEsquinas = new int[4];
		//
		// for (int i = 0; i < fila; i++) {
		// for (int j = 0; j < col; j++) {
		// if (i == 0 && j == 0) { // Primera esquina
		// vecEsquinas[0] = matriz[i][j];
		// }
		//
		// if (i == 0 && j == col - 1) { // Segunda esquina
		// vecEsquinas[1] = matriz[i][j];
		// }
		//
		// if (i == fila - 1 && j == 0) { // Tercera esquina
		// vecEsquinas[2] = matriz[i][j];
		// }
		//
		// if (i == fila - 1 && j == col - 1) { // Cuarta esquina
		// vecEsquinas[3] = matriz[i][j];
		// }
		// }
		// }
		//
		// for (int i = 0; i < vecEsquinas.length; i++) {
		// System.out.println(vecEsquinas[i]);
		// }

	}

	/**
	 * M�todo que genera las diagonales principal y secundaria de una matriz
	 * 
	 * @param matriz
	 * @param col
	 */
	public static void diagonalesMatriz(int[][] matriz, int col) {

		int contCol = 1;
		int contFil = 0;
		int[] diagonal = new int[matriz.length];
		int[] diagonalSec = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) { // Diagonal Principal >> A 1,1 - A 2,2 - A 3,3 ...

					diagonal[i] = matriz[i][j];
				}

				// Diagonal Secundaria
				if (i == contFil && j == col - contCol) {
					contFil++;
					contCol++;
					diagonalSec[i] = matriz[i][j];
				}
			}
		}

		System.out.print("Diagonal Principal: ");
		for (int i = 0; i < diagonal.length; i++) {
			System.out.print(" " + diagonal[i]);
		}
		System.out.println("");

		System.out.print("Diagonal Secundaria: ");
		for (int i = 0; i < diagonalSec.length; i++) {
			System.out.print(" " + diagonalSec[i]);
		}
		System.out.println("");

	}

	/**
	 * M�todo que genera la traspuesta de una matriz
	 * 
	 * @param matriz
	 * @param fila
	 * @param col
	 */
	public static void matrizTraspuesta(int[][] matriz, int fila, int col) {

		int transpose[][] = new int[col][fila];

		int contCol = 0;
		int contFil = 0;

		for (int i = 0; i < fila; i++) {

			for (int j = 0; j < col; j++) {

				transpose[contFil][contCol] = matriz[i][j];
				contFil++;
			}
			contCol++;
			contFil = 0;
		}

		System.out.println("");
		System.out.println("Traspuesta");
		for (int i = 0; i < transpose.length; i++) {
			System.out.println("");
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(" " + transpose[i][j]);
			}
		}
		System.out.println("");

	}

}
