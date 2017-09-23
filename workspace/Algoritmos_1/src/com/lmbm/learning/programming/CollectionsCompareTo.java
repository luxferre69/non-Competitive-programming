package com.lmbm.learning.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCompareTo {

	public static void main(String[] args) {

		List<Persona> list = new ArrayList<>();

		Persona per0 = new Persona("Mario", 187, 22);
		list.add(per0);
		Persona per1 = new Persona("Pepe", 173, 52);
		list.add(per1);
		Persona per2 = new Persona("Manuel", 158, 27);
		list.add(per2);
		Persona per3 = new Persona("David", 164, 25);
		list.add(per3);
		Persona per4 = new Persona("Alberto", 184, 80);
		list.add(per4);

		System.out.println("Sin ordenar");
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

		Collections.sort(list);
		System.out.println();
		System.out.println("Ordenado");
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

	}

	public static class Persona implements Comparable<Persona> {

		public String nombre;
		public int altura;
		public int edad;

		public Persona(String nombre, int altura, int edad) {
			this.nombre = nombre;
			this.altura = altura;
			this.edad = edad;
		}

		@Override
		public String toString() {
			return nombre + " - Altura: " + altura + " - Edad: " + edad;
		}

		@Override
		public int compareTo(Persona o) {
			
			// primer campo para ordenar : ALTURA
			// Si quisiese que fuese por la edad se colocaria primero
			if (this.altura != o.altura) {  // ICPC Rule
				return o.altura - altura;
				
				// Si las alturas son iguales evalua esta condición
			} else if (edad != o.edad) { 
				return edad - o.edad; 
			} else { // si la edad y la altura es igual
				return 0;
			}
		}

	}
}
