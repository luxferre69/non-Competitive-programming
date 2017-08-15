package com.lmbm.learning.programming;

import java.util.Scanner;

public class AlgoritmosDecisiones {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		//Ejercicios de decisiones //50
		
		/* 1. Leer un n�mero entero y determinar si es un n�mero terminado en 4. Residuo %
		
		
		System.out.println("Ingrese un n�mero >> ");
		n = lector.nextInt();
		
		if (n % 10 == 4) {
			System.out.println("termina en 4");
		}else{
			System.out.println("No termina en 4");
		}**/
		
		/* 2. Leer un n�mero entero y determinar si tiene 3 d�gitos.
		
		System.out.println("Ingrese un n�mero entero >> ");
		n = lector.nextInt();
		if(n >= 100){
			>>> tiene 3 digitos
		}
		
		/* 3. Leer un n�mero entero y determinar si es negativo. 
		
		System.out.println("Ingrese un n�mero entero >> ");
		n = lector.nextInt();
		
		if (n < 0){
			System.out.println("el n�mero es negativo, menor que 0");
		}
		
		/* 4. Leer un n�mero entero de dos d�gitos y determinar a cu�nto es igual la suma de sus d�gitos. 
		
		System.out.println("Ingrese un n�mero entero de dos digitos >> ");
		n = lector.nextInt();
		
		int suma = n/10 + n%10;
		System.out.println("la suma de los dos digitos es " +suma);*/
		
		/**5. Leer un n�mero entero de dos d�gitos y determinar si ambos d�gitos son pares.
		
		System.out.println("Ingrese un n�mero entero de dos digitos >> ");
		n = lector.nextInt();
		
		if((n/10)%2 == 0 && (n%10)%2 == 0){
			System.out.println("Son n�meros pares ambos");
		}else{
			System.out.println("alguno de los no es par");
		}**/
		
		/*6. Leer un n�mero entero de dos d�gitos menor que 20 y determinar si es primo.
		
		System.out.println("ingrese un n�mero de dos digitos menor que 20");
		int n = lector.nextInt();
		if (n > 10 && n < 20) {
			
			
		}else{
			System.out.println("el n�mero no es menor que 20");
		}*/
		
		/*7. Leer un n�mero entero de dos d�gitos y determinar si es primo y adem�s si es negativo.*/
		
		/*8. Leer un n�mero entero de dos d�gitos y determinar si sus dos d�gitos son primos.*/
		
		/*9. Leer un n�mero entero de dos d�gitos y determinar si un d�gito es m�ltiplo del otro.
		
		n = lector.nextInt();
		int primer = n/10;
		int segundo = n%10;
		
		if(primer % segundo == 0){
			System.out.println(primer +" es  multiplo de " +segundo);
		}else{
			System.out.println("No es");
		}*/
		
		/*10. Leer un n�mero entero de dos d�gitos y determinar si los dos d�gitos son iguales.
		n = lector.nextInt();
		int primer = n/10;
		int segundo = n%10;
		
		if(primer == segundo){
			System.out.println(primer +" es  igual a " +segundo);
		}else{
			System.out.println("No es");
		}*/
		
		/*13. Leer dos n�meros enteros de dos d�gitos y determinar si la suma de los dos n�meros origina
		un n�mero par.
		
		System.out.println("ingrese un numero de dos cifras");
		n = lector.nextInt();
		System.out.println("Ingrese otro numero de dos cifras");
		m = lector.nextInt();
		
		if((n + m) % 2 == 0){
			System.out.println("la suma es par>> " +(n+m));
		}else{
			System.out.println("no es par>>");
		}*/
		
		/*15. Leer un n�mero entero de tres d�gitos y determinar a cu�nto es igual la suma de sus d�gitos.
		n = lector.nextInt();
		int primer = n/100;
		int segundo = n%100;
		int second = segundo/10;
		int tercer = n%10;
		System.out.println("primer > " +primer + "segundo > " +second+ "tercer " +tercer);
		*/
		
		/*19. Leer tres n�meros enteros y determinar cu�l es el mayor. Usar solamente dos variables.
		
		int var1, var2;
		
		System.out.print("Ingrese primer n�mero >> ");
		var1 = lector.nextInt();
		System.out.print("Ingrese segundo n�mero >> ");
		var2 = lector.nextInt();
		
		if (var1 > var2) {
			System.out.print("Ingrese tercer n�mero if >> ");
			var2 = lector.nextInt();
			
			if (var2 > var1) {
				System.out.println("El mayor es >> " +var2);
			}else{
				System.out.println("El mayor es >> " +var1);
			}
		}else{
			System.out.print("Ingrese tercer n�mero else >> ");
			var1 = lector.nextInt();
			
			if (var1 > var2) {
				System.out.println("El mayor es >> " +var1);
			}else{
				System.out.println("El mayor es >> " +var2);
			}
		}*/
		
		
		/*20. Leer tres n�meros enteros y mostrarlos ascendentemente.
		
		int num1, num2, num3;
		
		System.out.println("Ingrese primer n�mero");
		num1 = lector.nextInt();
		System.out.println("Ingrese Segundo n�mero");
		num2 = lector.nextInt();
		System.out.println("Ingrese tercer n�mero");
		num3 = lector.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			
			if(num2 < num3){
				System.out.print(num1 +","+num2+","+num3);
			}else{
				System.out.print(num1 +","+num3+","+num2);
			}
			
		}else if (num2 < num1 && num2 < num3){
			System.out.print(num2);
			System.out.print(",");
			
			if(num1 < num3){
				System.out.print(num1);
				System.out.print("," +num3);
			}else{
				System.out.print(num3);
				System.out.print("," +num1);
			}
			
		}else{
			System.out.print(num3);
			System.out.print(",");
			
			if(num1 < num2){
				System.out.print(num1);
				System.out.print("," +num2);
			}else{
				System.out.print(num2);
				System.out.print("," +num1);
			}
		}*/
		
		/*21. Leer tres n�meros enteros de dos d�gitos cada uno y determinar en cu�l de ellos se encuentra
		el mayor d�gito.
		
		int num1, num2, num3;
		int mayor1, mayor2, mayor3;
		
		System.out.println("Ingrese primer n�mero de dos digitos");
		num1 = lector.nextInt();
		System.out.println("Ingrese Segundo n�mero de dos digitos");
		num2 = lector.nextInt();
		System.out.println("Ingrese tercer n�mero de dos digitos");
		num3 = lector.nextInt();
		
		if (num1/10 > num1%10) {
			mayor1 = num1/10;
			
		}else{
			mayor1=num2%10;
		}
		
		if (num2/10 > num2%10) {
			mayor2 = num2/10;
			
		}else{
			mayor2=num2%10;
		}
		
		if (num3/10 > num3%10) {
			mayor3 = num3/10;
			
		}else{
			mayor3=num3%10;
		}
		
		if (mayor1 > mayor2 && mayor1 > mayor3) {
			System.out.println("el mayor es >> " +mayor1);
		}else if(mayor2 > mayor1 && mayor2 > mayor3){
			System.out.println("el mayor es >> " +mayor2);
		}else{
			System.out.println("el mayor es >> " +mayor2);
		}*/
		
		
		/*22. Leer un n�mero entero de tres d�gitos y determinar si el primer d�gito es igual al �ltimo.
		System.out.println("Ingrese un n�mero de 3 cifras");
		int num = lector.nextInt();
		
		if (num/100 == num%10) {
			System.out.println("Los n�meros son iguales");
		}else{
			System.out.println("No son iguales");
		}*/
		
		/*23. Leer un n�mero entero de tres d�gitos y determinar cu�ntos d�gitos primos tiene.*/
		
		/*24. Leer un n�mero entero de tres d�gitos y determinar cu�ntos d�gitos pares tiene.-
		
		
		int num = lector.nextInt();
		int cont = 0;
		
		int num1, num2, num3;
		
		num1 = num/100;
		num2 = (num%100)/10;
		num3 = num%10;
		
		if (num1 % 2 == 0 ) {
			cont ++;
		}
		
		if (num2 % 2 == 0 ) {
			cont ++;
		}
		
		if (num3 % 2 == 2 ) {
			cont ++;
		}
		
		System.out.println("El n�mero tiene " +cont+ " pares");*/
		
		/*25. Leer un n�mero entero de tres d�gitos y determinar si alguno de sus d�gitos es igual a la suma
		de los otros dos.
		
		int num = lector.nextInt();
		int num1, num2, num3;
		
		num1 = num/100;
		num2 = (num%100)/10;
		num3 = num%10;
		
		if (num1 + num2 == num3) {
			System.out.println(num1 + " + " + num2 + " = " +num3 );
		}else if(num1 + num3 == num2){
			System.out.println(num1 + " + " + num3 + " = " +num2 );
		}else if(num2 + num3 == num1){
			System.out.println(num2 + " + " + num3 + " = " +num1 );
		}*/
		
		/*26. Leer un n�mero entero de cuatro d�gitos y determinar a cuanto es igual la suma de sus d�gitos.
		
		int num = lector.nextInt();
		
		int num1,num2,num3,num4;
		
		System.out.println(num1 = num/1000);
		System.out.println(num2 = (num%1000)/100);
		System.out.println(num3 = (num%100)/10);
		System.out.println(num4 = (num%10));
		
		int suma = num1+num2+num3+num4;
		
		System.out.println("La suma es " +suma);*/
		
		/*27. Leer un n�mero entero de cuatro d�gitos y determinar cu�ntos d�gitos pares tiene.
		
		int num = lector.nextInt();
		
		int num1,num2,num3,num4;
		int cont = 0;
		
		System.out.println(num1 = num/1000);
		System.out.println(num2 = (num%1000)/100);
		System.out.println(num3 = (num%100)/10);
		System.out.println(num4 = (num%10));
		
		if (num1%2 == 0) {
			cont++;
		}
		if (num2%2 == 0) {
			cont++;
		}
		if (num3%2 == 0) {
			cont++;
		}
		if (num4%2 == 0) {
			cont++;
		}
		
		System.out.println("hay " +cont+ " digitos pares");*/
		
		/*28. Leer un n�mero entero menor que 50 y positivo y determinar si es un n�mero primo.*/
		
		/*29. Leer un n�mero entero de cinco d�gitos y determinar si es un n�mero capic�o. Ej. 15651,
		59895.
		
		int num = lector.nextInt();
		
		if (num >= 10000 && num <= 99999) {
			int num1,num2,num3,num4,num5;
			
			System.out.println(num1 = num/10000);
			System.out.println(num2 = (num%10000)/1000);
			System.out.println(num3 = (num%1000)/100);
			System.out.println(num4 = (num%100)/10);
			System.out.println(num5 = num%10);
			
			if (num1 == num5 && num2 == num4) {
				System.out.println("Es capicuo");
			}else{
				System.out.println("No es capicuo");
			}
		}else{
			System.out.println("No es n�mero de cinco digitos");
		}*/
		
		/*30. Leer un n�mero entero de cuatro d�gitos y determinar si el segundo d�gito es igual al pen�ltimo.
		
		int num = lector.nextInt();
		
		int num2,num3;
		
		System.out.println(num2 = (num%1000)/100);
		System.out.println(num3 = (num%100)/10);
		
		if (num2 == num3) {
			System.out.println("Son iguales");
		}else{
			System.out.println("N oson");
		}*/
		
		/*31. Leer un n�mero entero y determina si es igual a 10.*/
		
		
		
		/*32. Leer un n�mero entero y determinar si es m�ltiplo de 7.*/
		
		
		/*33. Leer un n�mero entero y determinar si termina en 7.*/
		/*34. Leer un n�mero entero menor que mil y determinar cu�ntos d�gitos tiene.
		
		int num = lector.nextInt();
		
		if (num < 1000) {
			
			if (num > 0 && num < 10) {
				System.out.println("Tiene un digito");
			}
			
			if (num >= 10 && num <=99) {
				System.out.println("Tiene dos digitos");
			}
			
			if (num >= 100 && num <=999) {
				System.out.println("Tiene 3 digitos");
			}
		}*/
		
		/*36. Leer un n�mero entero de 4 d�gitos y determinar si tiene mas d�gitos pares o impares.*/
		/*37. Leer dos n�meros enteros y determinar cu�l es m�ltiplo de cu�l.*/
		
		/*40. Leer dos n�meros enteros y si la diferencia entre los dos es menor o igual a 10 entonces
		mostrar en pantalla todos los enteros comprendidos entre el menor y el mayor de los n�meros
		le�dos.*/
		
		//connnn ciicloooossss
		
	}

}
