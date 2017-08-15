package com.lmbm.learning.programming;

import java.util.Scanner;

/**
 *
 * @author Lux Ferre
 */
public class AlgoritmosCadenas {

    public static void main(String[] args) {

        //esVocalConsonanteOnum('a');
        Scanner sc = new Scanner(System.in);
       

        String palabra;
        System.out.println("Escribe una palabra: ");
        palabra = sc.next();
        esPalindromo(palabra);
        
        
    }

    /**
     * lee un carácter e imprime si es vocal, consonante o numérico (utiliza
     * ciclo for y break para cortar el ciclo)
     *
     * @param caracter
     */
    public static void esVocalConsonanteOnum(char caracter) {

        char[] vocal = {'a', 'e', 'i', 'o', 'u'};

        if (Character.isLetter(caracter)) {
            for (char element : vocal) {
                if (element == caracter) {
                    System.out.println(caracter + " es una vocal ");
                    break;
                } else {
                    System.out.println(caracter + " es una consonante ");
                    break;
                }
            }
        } else if (Character.isDigit(caracter)) {
            System.out.println(caracter + " Es un nÃºmero");
        }

    }

    /**
     * Obtiene las letras del abecedario
     */
    static void getCharAyZ() {
        char c;
        for (int i = 0; i < 26; i++) {
            // obtener caracteres entre 'A' y 'Z'
            // se obtiene el correspondiente número de la letra y se hace el cast a carácter (char)
            c = (char) ('A' + i % ('Z' - 'A' + 1));
            System.out.println(" " + c);

        }
    }

    /**
     * Algoritmo que indica si una palabra leída del teclado es un palíndromo.
     * Un palíndromo (capicúa) es una palabra que se lee igual en ambos sentidos
     * como arenera
     *
     * @param palabra
     */
    public static void esPalindromo(String palabra) {

        boolean esPalindromo = false;

        for (int i = 0; i < palabra.length(); i++) {
            char init = palabra.charAt(i);
            char last = palabra.charAt(palabra.length() - (i + 1));
            if (init == last) {
                esPalindromo = true;
            } else {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }

}
