package com.lmbm.learning.programming;

import java.util.Scanner;

public class AlgoritmosCiclos {

    public static void main(String[] args) {

        //1. Leer un n�mero entero y mostrar todos los enteros comprendidos entre 1 y el n�mero le�do.
        Scanner lector = new Scanner(System.in);
        //int num = lector.nextInt();

//		int num = lector.nextInt();
//		
//		for (int i = 1; i <=num; i++) {
//			System.out.println(i);
//		}
//		2. Leer un n�mero entero y mostrar todos los pares comprendidos entre 1 y el n�mero le�do.
//		for (int i = 1; i <=num; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//		3. Leer un n�mero entero y mostrar todos los divisores exactos del n�mero comprendidos entre 1
//		y el n�mero le�do.
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.println(i);
//			}
//		}
        //4. Leer dos n�meros y mostrar todos los enteros comprendidos entre ellos. (1)
        //5. Leer dos n�meros y mostrar todos los n�meros terminados en 4 comprendidos entre ellos. (2)
//		int num1,num2;
//		
//		System.out.println("Ingrese el primer n�mero :");
//		num1 = lector.nextInt();
//		System.out.println("Ingrese el segundo n�mero :");
//		num2 = lector.nextInt();
//		for (int i = num1; i < num2; i++) {
//			//System.out.println(i); (1)
//			
//			if (i % 10 == 4) {
//				System.out.println(i); // (2)
//			}
//		}
//		//6. Leer un n�mero entero de tres d�gitos y mostrar todos los enteros comprendidos entre 1 y cada
//			uno de los d�gitos.
        //9. Mostrar en pantalla todos los n�meros terminados en 6 comprendidos entre 25 y 205.
//		for (int i = 25; i <= 205; i++) {
//			if (i % 10 == 6) {
//				System.out.println(i);
//			}
//		}
        //10. Leer un n�mero entero y determinar a cu�nto es igual la suma de todos los enteros
//		comprendidos entre 1 y el n�mero le�do.
//		System.out.println("Ingrese n�mero ");
//		int num = lector.nextInt();
//		int sum = 0;
//		
//		for (int i = 1; i <= num; i++) {
//			 sum = sum + i;
//		}
//		System.out.println(sum);
//		11. Leer un n�mero entero de dos d�gitos y mostrar en pantalla todos los enteros comprendidos
//		entre un d�gito y otro.
        //System.out.println("Ingrese : ");
        //int num = lector.nextInt();
//		for (int i = num/10; i <= num%10; i++) {
//			// 11 System.out.println(i);
//			
//		}
        //13. Leer un entero y mostrar todos los m�ltiplos de 5 comprendidos entre 1 y el n�mero le�do.
//		for (int i = 1; i <= num; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i);
//			}
//		}
        //14. Mostrar en pantalla los primeros 20 m�ltiplos de 3.
//		15. Escribir en pantalla el resultado de sumar los primeros 20 m�ltiplos de 3.
//		int suma = 0;
//		for (int i = 1; i <= 20; i++) {
//			int a = 3 * i;
//			suma = suma + a;
//		}
//		System.out.println(suma);
//		16. Mostrar en pantalla el promedio entero de los n primeros m�ltiplos de 3 para un n�mero n
//		le�do.
//		int pro = 0, suma = 0;
//		System.out.println("Ingrese n: ");
//		int n = lector.nextInt();
//		for (int i = 1; i <= n; i++) {
//			int a = 3 * i;
//			suma = suma + a;
//			pro = suma / n;
//		}
//		System.out.println(pro);
//		System.out.println(suma);
//		18. Leer dos n�meros entero y mostrar todos los m�ltiplos de 5 comprendidos entre el menor y el
//		mayor.
//		int num1, num2;
//		
//		System.out.println("Ingrese primer");
//		num1 = lector.nextInt();
//		System.out.println("Ingrese segundo");
//		num2 = lector.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println("El mayor es : " +num1);
//			for (int i = num2; i < num1; i++) {
//				int mult = 5 * i;
//				System.out.println(mult);
//			}
//		}else{
//			for (int i = num1; i < num2; i++) {
//				int mult = 5 * i;
//				System.out.println(mult);
//			}
//		}
        //19. Leer un n�mero entero y determinar si es primo.
//		int num = lector.nextInt();
//		boolean esPrimo = false;
//		for (int i = 2; i <= num; i++) {
//			if (num % i != 0) {
//				esPrimo = true;
//				System.out.println("Es primo");
//			}else{
//				esPrimo = false;
//				System.out.println(i%num);
//				System.out.println(i);
//			}
//		}
//		if (esPrimo) {
//			System.out.println("Es Primo");
//		}else{
//			System.out.println("NO es Primo");
//		}
        //20. Leer un n�mero entero y determinar cu�ntos d�gitos tiene.
        //21. Leer un n�mero entero y determinar a cu�nto es igual al suma de sus d�gitos.
        //22. Leer un n�mero entero y determinar cu�ntas veces tiene el d�gito 1
        //23. Leer un n�mero entero y determinar si la suma de sus d�gitos es tambi�n un n�mero primo.
        //24. Leer un n�mero entero y determinar a cu�nto es igual al suma de sus d�gitos pares.
        //25. Leer un n�mero entero y determinar a cu�nto es igual el promedio entero de sus d�gitos.
        //26. Leer un n�mero entero y determinar cu�l es el mayor de sus d�gitos.
        //29. Leer un n�mero entero y determinar a cu�nto es igual el primero de sus d�gitos.
//		int num = lector.nextInt();
//		int cont = 0, elNum = num, acum = 0;
//		int suma = 0, prom = 0, mayor = 0;
//		
//		while (num >= 1) {
//			acum = num%10;
//			num = num/10;
//		
//			//System.out.println(num);
//			cont++;
////			if (acum == 1) { // cuantas veces tiene el numero 1
////				cont++;
////			}
////			if (acum % 2 == 0) { // suma pares
////				suma += acum;
////			}
//			
////			if (acum > mayor) { // mayor de todos los digitos
////				mayor = acum;
////			}
//			
////			if (num < 10 && num != 0) {
////				System.out.println("primero " +num); // primero de sus digitos
////			}
//			prom = acum / cont;
//			
//			
//		}
//		System.out.println("El n�mero " +elNum+ " tiene " +cont+ " digitos");
//		System.out.println("La suma de " +elNum+  " es " + acum);
//		System.out.println("Suma de pares >> " +suma);
//		//System.out.println("El promedio es >> " +prom);
//		System.out.println("el mayor " +mayor);
//		
//		//30. Leer un n�mero entero y mostrar todos sus componentes num�ricos o sea aquellos para
//		quienes el sea un m�ltiplo.
//		31. Leer n�meros hasta que digiten 0 y determinar a cu�nto es igual el promedio de los n�meros
//		terminados en 5.
//		int num = 0, acum = 0, prom = 0, cont = 0;
//		do {
//			System.out.println("Digite");
//			num = lector.nextInt();
//			if (num != 0 && num % 5 == 0) {
//				System.out.println("1");
//				acum += num;
//				cont++;
//			}
//			
//		} while (num != 0);
//		prom = acum/cont;
//		System.out.println(">>> " +prom+ " ++ "+acum+ " cont "+cont);
//		33. Si 32768 es el tope superior para los n�meros entero cortos, determinar cu�l es el n�mero
//		primo mas cercano por debajo de �l.
//		boolean ban = false;
//		System.out.println("Ingrese n�mero para saber si es primo");
//		int n = lector.nextInt();
//		int a = 0, i;
//		for (i = 1; i < (n + 1); i++) {
//			System.out.println(">> " +i);
//			if (n % i == 0) {
//				a++;
//				System.out.println("> ");
//			}
//		}
//		if (a != 2) {
//			ban = false;
//			System.out.println("No es Primo");
//			System.out.println("I: " +a);
//		} else {
//			ban = true;
//			System.out.println("Si es Primo");
//			System.out.println("II: " +a);   ??????????????????????
//		}
//		34. Generar los n�meros del 1 al 10 utilizando un ciclo que vaya de 10 a 1.
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
//		35. Leer dos n�meros enteros y determinar a cu�nto es igual el producto mutuo del primer d�gito
//		de cada uno.
//		System.out.println("Ingrese primer");
//		int num1 = lector.nextInt();
//		System.out.println("Ingrese segundo");
//		int num2 = lector.nextInt();
//		while (num1 >= 1 && num2 >= 1) {
//			num1 = num1 / 10;
//			num2 = num2 / 10;
//			if (num1 < 10 && num1 != 0 && num2 < 10 && num2 != 0) {
//				int multi = num1 * num2;
//				System.out
//						.println("La multiplicaci�n de los dos primeros n�mero es "
//								+ multi);
//			}
//		}
//		36. Mostrar en pantalla la tabla de multiplicar del n�mero 5.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("5 X " + i + " : " + 5*i );
//		}
//		37. Generar todas las tablas de multiplicar del 1 al 10.
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				System.out.println(i+ " X " + j + " : " + i*j );
//				if (j == 10) {
//					System.out.println("Tabla del " +i);
//				}
//			}
//		}
//		38. Leer un n�mero entero y mostrar en pantalla su tabla de multiplicar.
//		System.out.println("Ingres un n�mero ");
//		int num = lector.nextInt();
//		System.out.println("Tabla del :" +num);
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num+ " X " + i + " : " + num*i );
//		}
//		39. Se define la serie de Fibonacci como la serie que comienza con los d�gitos 1 y 0 y va sumando
//		progresivamente los dos �ltimos elementos de la serie, as�:
//		0 1 1 2 3 5 8 13 21 34.......
//		Utilizando el concepto de ciclo generar la serie de Fibonacci hasta llegar o sobrepasas el n�mero
//		10000.
        // 0 + 1 + 1 + 2
//		int p = 0;
//		int primero = 1;
//		int anterior = 0;
//		System.out.println(anterior);
//		do {
//			System.out.println(primero);
//			primero = primero + anterior;
//			anterior = primero - anterior;
//			
//		} while (primero < 10000);
//		44. Leer un n�mero y calcularle su factorial.
//		int num = lector.nextInt();
//		int factorial = 1;
//		for (int i = num; i >= 1; i--) {
//			factorial = factorial * i;
//		}
//		System.out.println("El factorial de !" +num+ " es: " +factorial);
//		45. Leer un n�mero y calcularle el factorial a todos los enteros comprendidos entre 1 y el n�mero
//		le�do.
//		46. Leer un n�mero entero y calcular el promedio entero de los factoriales de los enteros
////	comprendidos entre 1 y el n�mero le�do.
//		47. Leer un n�mero entero y calcular a cu�nto es igual la sumatoria de todos los factoriales de los
//		n�meros comprendidos entre 1 y el n�mero le�do.
//		int num = lector.nextInt();
//		int promedio = 0;
//		int suma = 0;
//		for (int j = 1; j <= num; j++) {
//			int factorial = 1;
//			for (int i = j; i >= 1; i--) {
//				factorial = factorial * i;
//			}
//			System.out.println("factorial de " +j+ " es: " +factorial);
//			suma = suma + factorial;
//			promedio = suma / num; 
//		}
//		System.out.println("La sumatoria es: " +suma);
//		System.out.println("El promedio es : " +promedio);
//		48. Utilizando ciclos anidados generar las siguientes parejas de enteros
//		
//		0 1
//		1 1
//		2 2
//		3 2
//		4 3
//		5 3
//		6 4
//		7 4
//		8 5
//		9 5
//        int cont = 0;
//        int aux = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("");
//            for (int j = 0; j < 2; j++) {
//                if (j == 1) {
//                    System.out.print(" " + aux);
//                } else {
//                    System.out.print(" " + i);
//                    if (cont == 2) {
//                        cont = 0;
//                        aux++;
//                    }
//                    cont++;
//                }
//            }
//        }
//        System.out.println("");
        //    50. Utilizando ciclos anidados generar las siguientes parejas de números
        //
        //0 1
        //1 1
        //2 1
        //3 1
        //4 2
        //5 2
        //6 2
        //7 2
//        int cont = 0;
//        int aux = 1;
//        for (int i = 0; i < 8; i++) {
//            System.out.println("");
//            for (int j = 0; j < 2; j++) {
//                if (j == 1) {
//                    System.out.print(" " + aux);
//                } else {
//                    System.out.print(" " + i);
//                    if (cont == 4) {
//                        cont = 0;
//                        aux++;
//                    }
//                    cont++;
//                }
//            }
//        }
//        System.out.println("");
        //        49. Utilizando ciclos anidados generar las siguientes ternas de números
        //
        //1 1 1
        //2 1 2
        //3 1 3
        //4 2 1
        //5 2 2
        //6 2 3
        //7 3 1
        //8 3 2
        //9 3 3
//        int cont = 0;
//        int aux = 1;
//        int col = 1;
//        for (int i = 1; i < 10; i++) {
//            System.out.println("");
//            for (int j = 1; j <= 3; j++) {
//                switch (j) {
//                    case 2:
//                        System.out.print(" " + aux);
//                        break;
//                    case 3:
//                        System.out.print(" " + col);
//                        break;
//                    default:
//                        System.out.print(" " + i);
//                        if (cont == 3) {
//                            cont = 0;
//                            aux++;
//                            col = 1;
//                        }
//                        break;
//                }
//            }
//            cont++;
//            col++;
//        }
//        System.out.println("");
        /**
         * Piramide 1
         */
        System.out.println("Ingrese la altura de la piramide: ");
        int n = lector.nextInt();

        // Piramide 1
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
        // Piramide 2
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        // Piramide 3
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    


    }

    // Piramide Normal de n altura
    public static void piramideNormal(int altura) {
        int c = 1;
        int aux = altura;
        int cont = 0;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {

                // Primera cara de la piramide
                if (c++ >= aux) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                // Segunda cara de la piramide
                if (altura == j) {
                    for (int k = 0; k < cont; k++) {
                        System.out.print("*");
                    }
                    cont++;
                }
            }
            aux--;
            c = 1;
            System.out.println("");
        }
    }

//    piramide invertida de n altura
    public static void piramideInvertida(int altura) {
        int aux = altura;
        int c = altura;
        int var = altura - 1;

        for (int i = altura; i >= 1; i--) {
            for (int j = altura; j >= 1; j--) {

                if (c >= aux--) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (j == 1) {
                    for (int k = var; k >= 1; k--) {
                        System.out.print("*");
                    }
                    var--;
                }
            }
            c--;
            aux = altura;
            System.out.println("");
        }
    }

}
