package com.lmbm.learning.programming;

import java.util.Scanner;

public class AlgoritmosArreglos {

    public static void main(String[] args) {

        // 1. Leer 10 enteros, almacenarlos en un vector y determinar en qu�
        // posici�n del vector est� el
        // mayor n�mero le�do.
        // 7. Leer 10 n�meros enteros, almacenarlos en un vector y determinar en
        // qu� posiciones se
        // encuentra el n�mero mayor.
        Scanner lector = new Scanner(System.in);
//		int[] arr = new int[5];
//		int num = 0;
//		int posMayor = 0;
//		int posMenor = 0;
//		while (num < 5) {
//			System.out.println("Ingrese un número");
//			arr[num] = lector.nextInt();
//			num++;
//		}

        // for (int index = 1; index < arr.length; index++) {
        // if (arr[index] > arr[posMayor]) {
        // posMayor = index;
        // }
        // }
        // System.out.println("el n�mero "+ arr[posMayor]
        // +" est� en la posici�n " +posMayor + " del vector");
        // 2. Leer 10 enteros, almacenarlos en un vector y determinar en qu�
        // posici�n del vector est� el
        // mayor n�mero par le�do.
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
        // System.out.println("el n�mero par " + arr[posMayor]
        // + " est� en la posici�n " + posMayor + " del vector");
        // }
        // 3. Leer 10 enteros, almacenarlos en un vector y determinar en qu�
        // posici�n del vector est� el
        // mayor n�mero primo le�do.
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
        // 5. Almacenar en un vector de 10 posiciones los 10 n�meros primos
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
        // 8. Leer 10 n�meros enteros, almacenarlos en un vector y determinar en
        // qu� posiciones se
        // encuentran los n�meros terminados en 4.
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 10 == 4) {
        // System.out.print("Las posiciones son:" +i);
        // }
        // }
        // 9. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // cu�ntas veces est� repetido
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
        // System.out.println("El n�mero " +arr[posMayor]+ " est� repetido "
        // +cont+ " veces");
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] >= 100) {
        // System.out.println("Posiciones > " +i);
        // }
        // }
        // 12. Leer 10 n�meros enteros, almacenarlos en un vector y determinar a
        // cu�nto es igual el
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
        // 15. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // cu�ntos datos almacenados
        // son m�ltiplos de 3.
        // int mult = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 3 == 0) {
        // System.out.print(" " +arr[i]);
        // mult++;
        // }
        // }
        // System.out.println();
        // System.out.println("Multiplos >> " +mult);
        // 19. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // cu�l es el n�mero menor.
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < arr[posMenor]) {
        // posMenor = i;
        // }
        // }
        // System.out.println(arr[posMenor]);
        // 21. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // en qu� posici�n est� el
        // n�mero cuya suma de d�gitos sea la mayor.
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
        // System.out.println("El n�mero " +sumas[aux]+
        // " es el mayor de la suma y est� en la posici�n " +aux);
        // 22. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // cu�les son los n�meros
        // m�ltiplos de 5 y en qu� posiciones est�n.
        // StringBuilder pos = new StringBuilder();
        // System.out.print("Los n�meros multiplos de 5 son :");
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 5 == 0) {
        // pos.append(i).append(",");
        // System.out.print(" " +arr[i] + ",");
        // }
        // }
        //
        // System.out.print(" Las posiciones son: " +pos);
        // 24. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // en qu� posici�n est� el
        // n�mero con mas d�gitos. >>> Es el mismo del Mayor
        // 25. Leer 10 n�meros enteros, almacenarlos en un vector y determinar
        // cu�ntos de los n�meros
        // le�dos son n�meros primos terminados en 3.
        // int cont = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (!esPrimo(arr[i])) {
        // if (arr[i] % 10 == 3) {
        // cont++;
        // }
        // }
        // }
        // System.out.println("Los n�mero primos terminados en 3 son: " +cont);
        // //26. Leer 10 n�meros enteros, almacenarlos en un vector y calcularle
        // el factorial a cada uno de los
        // n�meros le�dos almacen�ndolos en otro vector.
        // 27. Leer 10 n�meros enteros, almacenarlos en un vector y determinar a
        // cu�nto es igual el
        // promedio entero de los factoriales de cada uno de los n�meros le�dos.
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
        // 28. Leer 10 n�meros enteros, almacenarlos en un vector y mostrar en
        // pantalla todos los enteros
        // comprendidos entre 1 y cada uno de los n�meros almacenados en el
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
        // 30. Leer 10 n�meros enteros, almacenarlos en un vector. Luego leer un
        // entero y determinar si este
        // �ltimo entero se encuentra entre los 10 valores almacenados en el
        // vector.
//		System.out.println("Ingrese un n�mero para comparar");
//		int led = lector.nextInt();
//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//			if (led == arr[i]) {
//				System.out.println("El n�mero " + led
//						+ "se encuentra en el vector " + arr[i]
//						+ "en la pos " + i);
//				flag = false;
//				break;
//			}else{
//				flag = true;
//			}
//		}
//		if (flag) {
//			System.out.println("No se encuentra");
//		}
//		for (int i = 0; i < arr.length; i++) {
//			int m = (int) Math.pow(arr[i], 2);
//			System.out.println("El cuadrado de " +arr[i] + "es " +m);
//		}
//		4. Cargar un vector de 10 posiciones con los 10 primeros elementos de la serie de Fibonacci y
//mostrarlo en pantalla
//        int[] arr = new int[10];
//
//        fibonnacciConCiclo(arr.length, arr);
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " +arr[i]);
//        }


        /**
         * Solución 1 con dos ciclos anidados
         */
//        for (int i = 0; i < arr.length; i++) {
//            
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("El repetido es " + arr[i]);
//                    break;
//                }
//            }           
//        }
        
//      Desarrolle un algoritmo que le permita leer un valor entero positivo N dado
//      en base decimal y convertirlo a base binaria.

        //decimalABinario(125);
        
        


    }

    public static int fibonnacciConCiclo(int n, int[] arr) {
        
        int primero = 1;
        int anterior = 0;
        //System.out.print(" " + anterior);
        for (int i = 0; i < n; i++) {
            //System.out.print(" " + primero);
            arr[i] = primero;
            primero = primero + anterior;
            anterior = primero - anterior;
        }
        return primero;
    }

    /**
     * Método que calcula si un número es primo o no. Un número primo sólo se
     * puede dividir exactamente por sí mismo y por 1.
     *
     * @param numero
     * @return false si el número tiene mas de un divisor exacto
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
     * Método que calcula el factorial de un número desde el número hasta 1. ej:
     * 5*4*3*2*1 = 120
     *
     * @param fact
     * @return la multiplicación total
     */
    public static int factorial(int fact) {
        int factorial = 1;
        for (int i = fact; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de !" + fact + " es: " + factorial);
        return factorial;
    }
    
    public static void decimalABinario(int num){
        
        int div, aux;
        while (num >= 2) {
            div = num;
            num = num / 2;
            aux =  div - (num * 2);
            System.out.print(" " +aux);
        }
        System.out.println("");
    }
    
}
