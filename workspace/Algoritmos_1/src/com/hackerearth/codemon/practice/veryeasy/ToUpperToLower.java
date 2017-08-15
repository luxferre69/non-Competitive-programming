package com.hackerearth.codemon.practice.veryeasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ToUpperToLower {
	public static void main(String args[]) throws Exception {

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		StringBuilder nuevo = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			String normal = Character.toString(s.charAt(i));
			String upper = Character.toString(s.charAt(i)).toUpperCase();
			String lower = Character.toString(s.charAt(i)).toLowerCase();

			if (normal.equals(upper)) {
				nuevo.append(lower);
			} else {
				nuevo.append(upper);
			}

		}
		System.out.println(nuevo.toString());

	}
}
