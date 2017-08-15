package com.hackerearth.codemon.practice.veryeasy;

import java.util.Scanner;

public class StackMonkey {

	private static int top = -1;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int cases = sc.nextInt();
		int stack[] = new int[cases];

		for (int i = 0; i < cases; i++) {

			if (sc.nextInt() == 1) {
				pop(stack);

			} else {
				int cost = sc.nextInt();
				push(stack, cost);
			}

		}

		sc.close();
	}

	/**
	 * Borra elemento d la pila
	 */
	static void pop(int stack[]) {

		if (top == -1) {
			System.out.println("No Food");
		} else {
			System.out.println(stack[top]);
			top = top - 1;
		}
	}

	/**
	 * Inserta un elemento en la pila
	 */
	static void push(int[] stack, int element) {

		if (top != stack.length - 1) {
			top = top + 1;
			stack[top] = element;
		}
	}

	static int size() {
		return top + 1;
	}

	static int topElement(int stack[]) {
		return stack[top];
	}

}
