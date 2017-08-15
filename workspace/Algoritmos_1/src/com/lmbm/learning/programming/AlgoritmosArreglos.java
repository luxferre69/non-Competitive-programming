package com.lmbm.learning.programming;

import java.util.Scanner;

public class AlgoritmosArreglos {

	public static void main(String[] args) {

		// 1. Leer 10 enteros, almacenarlos en un vector y determinar en quï¿½
		// posiciï¿½n del vector estï¿½ el
		// mayor nï¿½mero leï¿½do.
		// 7. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// en
		// quï¿½ posiciones se
		// encuentra el nï¿½mero mayor.
		Scanner lector = new Scanner(System.in);
		// int[] arr = new int[5];
		// int num = 0;
		// int posMayor = 0;
		// int posMenor = 0;
		// while (num < 5) {
		// System.out.println("Ingrese un nÃºmero");
		// arr[num] = lector.nextInt();
		// num++;
		// }

		// for (int index = 1; index < arr.length; index++) {
		// if (arr[index] > arr[posMayor]) {
		// posMayor = index;
		// }
		// }
		// System.out.println("el nï¿½mero "+ arr[posMayor]
		// +" estï¿½ en la posiciï¿½n " +posMayor + " del vector");
		// 2. Leer 10 enteros, almacenarlos en un vector y determinar en quï¿½
		// posiciï¿½n del vector estï¿½ el
		// mayor nï¿½mero par leï¿½do.
		// int var = 0;
		// for (int index = 0; index < arr.length; index++) {
		// if (arr[index] % 2 == 0) {
		// if (arr[index] > arr[posMayor]) {
		// posMayor = index;
		// var++;
		// }
		// }
		// }
		// if (var == 0 && posMayor == 0) {
		// System.out.println("No hay pares");
		// } else {
		// System.out.println("el nï¿½mero par " + arr[posMayor]
		// + " estï¿½ en la posiciï¿½n " + posMayor + " del vector");
		// }
		// 3. Leer 10 enteros, almacenarlos en un vector y determinar en quï¿½
		// posiciï¿½n del vector estï¿½ el
		// mayor nï¿½mero primo leï¿½do.
		// for (int index = 0; index < arr.length; index++) {
		// for (int i = 1; i <= arr[index]; i++) {
		// if (!esPrimo(arr[index])) {
		// if (arr[index] > arr[posMayor]) {
		// posMayor = index;
		// }
		// }
		// }
		// }
		// System.out.println(posMayor);
		// 5. Almacenar en un vector de 10 posiciones los 10 nï¿½meros primos
		// comprendidos entre 100 y
		// 300. Luego mostrarlos en pantalla.
		// int [] vector = new int [10];
		// int primos = 0;
		// int numeros = 100;
		//
		// while (primos != 10) {
		// if (!esPrimo(numeros)) {
		// vector[primos] = numeros;
		// primos ++;
		// }
		// numeros ++;
		// }
		//
		// for (int i = 0; i < vector.length; i++) {
		// System.out.print(" "+vector[i]);
		// }
		// 8. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// en
		// quï¿½ posiciones se
		// encuentran los nï¿½meros terminados en 4.
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] % 10 == 4) {
		// System.out.print("Las posiciones son:" +i);
		// }
		// }
		// 9. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// cuï¿½ntas veces estï¿½ repetido
		// el mayor.
		// int cont = 0;
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] > arr[posMayor]) {
		// posMayor = i;
		// }
		// }
		//
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[posMayor] == arr[i] ) {
		// cont++;
		// }
		// }
		//
		// if (cont > 1) {
		// System.out.println("El nï¿½mero " +arr[posMayor]+ " estï¿½ repetido "
		// +cont+ " veces");
		// }
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] >= 100) {
		// System.out.println("Posiciones > " +i);
		// }
		// }
		// 12. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// a
		// cuï¿½nto es igual el
		// promedio entero de los datos del vector.
		// int acum = 0;
		// int prom = 0;
		//
		// for (int i = 0; i < arr.length; i++) {
		// acum = acum + arr[i];
		// }
		// prom = acum / arr.length;
		// System.out.println("Suma " +acum);
		// System.out.println("Promedio " +prom);
		// 15. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// cuï¿½ntos datos almacenados
		// son mï¿½ltiplos de 3.
		// int mult = 0;
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] % 3 == 0) {
		// System.out.print(" " +arr[i]);
		// mult++;
		// }
		// }
		// System.out.println();
		// System.out.println("Multiplos >> " +mult);
		// 19. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// cuï¿½l es el nï¿½mero menor.
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] < arr[posMenor]) {
		// posMenor = i;
		// }
		// }
		// System.out.println(arr[posMenor]);
		// 21. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// en quï¿½ posiciï¿½n estï¿½ el
		// nï¿½mero cuya suma de dï¿½gitos sea la mayor.
		// int sum = 0;
		// int nume;
		// int aux = 0;
		// int [] sumas = new int[5];
		// for (int i = 0; i < arr.length; i++) {
		// nume = 0;
		// sum = arr[i] % 10;
		// arr[i] = arr[i] / 10;
		// nume = sum + arr[i];
		// sumas[i]=nume;
		// }
		//
		// for (int i = 0; i < sumas.length; i++) {
		// if (sumas[i] > sumas[aux]) {
		// aux = i;
		// }
		// }
		// System.out.println("El nï¿½mero " +sumas[aux]+
		// " es el mayor de la suma y estï¿½ en la posiciï¿½n " +aux);
		// 22. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// cuï¿½les son los nï¿½meros
		// mï¿½ltiplos de 5 y en quï¿½ posiciones estï¿½n.
		// StringBuilder pos = new StringBuilder();
		// System.out.print("Los nï¿½meros multiplos de 5 son :");
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] % 5 == 0) {
		// pos.append(i).append(",");
		// System.out.print(" " +arr[i] + ",");
		// }
		// }
		//
		// System.out.print(" Las posiciones son: " +pos);
		// 24. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// en quï¿½ posiciï¿½n estï¿½ el
		// nï¿½mero con mas dï¿½gitos. >>> Es el mismo del Mayor
		// 25. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// cuï¿½ntos de los nï¿½meros
		// leï¿½dos son nï¿½meros primos terminados en 3.
		// int cont = 0;
		// for (int i = 0; i < arr.length; i++) {
		// if (!esPrimo(arr[i])) {
		// if (arr[i] % 10 == 3) {
		// cont++;
		// }
		// }
		// }
		// System.out.println("Los nï¿½mero primos terminados en 3 son: "
		// +cont);
		// //26. Leer 10 nï¿½meros enteros, almacenarlos en un vector y
		// calcularle
		// el factorial a cada uno de los
		// nï¿½meros leï¿½dos almacenï¿½ndolos en otro vector.
		// 27. Leer 10 nï¿½meros enteros, almacenarlos en un vector y determinar
		// a
		// cuï¿½nto es igual el
		// promedio entero de los factoriales de cada uno de los nï¿½meros
		// leï¿½dos.
		// int pro = 0, sum = 0;
		// int[] factoriales = new int[5];
		// for (int i = 0; i < arr.length; i++) {
		// factoriales[i] = factorial(arr[i]);
		// }
		// System.out.println("Factoriales ");
		// for (int i = 0; i < factoriales.length; i++) {
		// System.out.print(" " + factoriales[i]);
		// sum = sum + factoriales[i];
		// pro = sum / factoriales.length;
		// }
		// System.out.println("Promedio: " +pro);
		// 28. Leer 10 nï¿½meros enteros, almacenarlos en un vector y mostrar en
		// pantalla todos los enteros
		// comprendidos entre 1 y cada uno de los nï¿½meros almacenados en el
		// vector.
		// for (int i = 0; i < arr.length; i++) {
		// int[] enteros = new int[arr[i]];
		//
		// System.out.println("Enteros comprendidos entre 1 y " +arr[i]+ "= ");
		// for (int j = 2; j < enteros.length; j++) {
		// enteros[j] = j;
		// System.out.println(enteros[j]);
		// }
		// }
		// 30. Leer 10 nï¿½meros enteros, almacenarlos en un vector. Luego leer
		// un
		// entero y determinar si este
		// ï¿½ltimo entero se encuentra entre los 10 valores almacenados en el
		// vector.
		// System.out.println("Ingrese un nï¿½mero para comparar");
		// int led = lector.nextInt();
		// boolean flag = false;
		// for (int i = 0; i < arr.length; i++) {
		// if (led == arr[i]) {
		// System.out.println("El nï¿½mero " + led
		// + "se encuentra en el vector " + arr[i]
		// + "en la pos " + i);
		// flag = false;
		// break;
		// }else{
		// flag = true;
		// }
		// }
		// if (flag) {
		// System.out.println("No se encuentra");
		// }
		// for (int i = 0; i < arr.length; i++) {
		// int m = (int) Math.pow(arr[i], 2);
		// System.out.println("El cuadrado de " +arr[i] + "es " +m);
		// }
		// 4. Cargar un vector de 10 posiciones con los 10 primeros elementos de
		// la serie de Fibonacci y
		// mostrarlo en pantalla
		// int[] arr = new int[10];
		//
		// fibonnacciConCiclo(arr.length, arr);
		//
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(" " +arr[i]);
		// }

		/**
		 * SoluciÃ³n 1 con dos ciclos anidados
		 */
		// for (int i = 0; i < arr.length; i++) {
		//
		// for (int j = 0; j < i; j++) {
		// if (arr[i] == arr[j]) {
		// System.out.println("El repetido es " + arr[i]);
		// break;
		// }
		// }
		// }

	}
	
	/**
	 * 
	 * 
	 * @param n
	 * @param arr
	 * @return
	 */
	public static int fibonnacciConCiclo(int n, int[] arr) {

		int primero = 1;
		int anterior = 0;
		// System.out.print(" " + anterior);
		for (int i = 0; i < n; i++) {
			// System.out.print(" " + primero);
			arr[i] = primero;
			primero = primero + anterior;
			anterior = primero - anterior;
		}
		return primero;
	}

	/**
	 * Método que calcula si un número es primo o no. Un número primo sólo
	 * se puede dividir exactamente por sí mismo y por 1.
	 *
	 * @param numero
	 * @return false si el nÃºmero tiene mas de un divisor exacto
	 */
	public static boolean esPrimo(int numero) {
		boolean temp = true;
		for (int i = 2; i <= (numero - 1); i++) {
			if (numero % i == 0) {
				temp = false;
				break;
			}
		}
		return temp;
	}

	/**
	 * Método que calcula el factorial de un número desde el número n hasta 1. ej:
	 * 5*4*3*2*1 = 120
	 *
	 * @param fact
	 * @return la multiplicaciÃ³n total
	 */
	public static int factorial(int fact) {
		int factorial = 1;
		for (int i = fact; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de !" + fact + " es: " + factorial);
		return factorial;
	}

}
