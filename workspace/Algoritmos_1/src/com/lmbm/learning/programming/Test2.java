package com.lmbm.learning.programming;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// int[] nums = new int[23];
		// int m = 1;
		// int s = 1;
		// for (int i = 0; i < nums.length; i++) {
		// nums[i] = s;
		// if (m < s) {
		// m=s;
		// s = s-2;
		// }else{
		// m=s;
		// s=s+4;
		// }
		// }
		//
		// for (int i = 0; i < nums.length; i++) {
		// System.out.print(" " +nums[i]+ ",");
		// }

		// int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };
		// int matrix2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		//
		// for (int i = 0; i < matrix1.length; i++) {
		// for (int j = 0; j < matrix1[i].length; ++j){
		// System.out.print(matrix1[i][j]);
		// }
		//
		// for (int j = 0; j < matrix2[i].length; ++j){
		// System.out.print(" " + matrix2[i][j]);
		// }
		//
		// System.out.println();
		// }

		// int [][] mat = new int [5][4];
		//
		//
		// for (int i = 0; i < mat.length; i++) {
		//
		// for (int j = 0; j < mat.length + mat[i].length; j++) {
		// System.out.print("+");
		// }
		// System.out.println();
		//
		// System.out.print("+");
		// for (int j = 0; j < mat[i].length; j++) {
		// System.out.print(mat[i][j]);
		// System.out.print("+");
		// }
		// System.out.println();
		// }

		// int n = s.nextInt();
		//
		// int primero = 1;
		// int anterior = 0;
		//
		// do {
		// primero = primero + anterior;
		// anterior = primero - anterior;
		//
		// if (anterior >= 3) {
		// for (int i = anterior + 1; (i < primero && i < n); i++) {
		// System.out.print(i + " ");
		// }
		// }
		//
		// } while (primero < n);

		// String[][] mat = new String[4+2][4+2];

		// String[][] mat = { { " ", " ", " ", " ", " ", " "}, { " ", "*", ".",
		// ".", ".", " " }, { " ", ".", ".", ".", ".", " " }, { " ", ".", "*",
		// ".", ".", " " },
		// { " ", ".", ".", ".", ".", " " }, { " ", " ", " ", " ", " ", " "} };

//		String let = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
//		
//		String pp = "WERTYUIOP[]\\SDFGHJKL;,'XCVBNM,./1234567890-=";
//		
//		
//		for (int i = 0; i < pp.length(); i++) {
//			
//			if (String.valueOf(pp.charAt(i)).equals(" ")) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 0; j < let.length(); j++) {
//				
//				if (String.valueOf(pp.charAt(i)).equals(String.valueOf(let.charAt(j)))) {
//					System.out.print(let.toCharArray()[j-1]);
//				}
//				
//			}
//			
//		}
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", dfs);
		
		double n = 8.89999916;
		//System.out.printf("%.1f", n);
		System.out.println(df.format(n));
	}
}
