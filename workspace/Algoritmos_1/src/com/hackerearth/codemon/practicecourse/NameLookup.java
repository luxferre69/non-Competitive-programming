package com.hackerearth.codemon.practicecourse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Ejemplo basado en el libro de Joyanes (Estructuras de datos con Java)
 * 
 * Implementa una tabla hash junto con resolución de colisiones
 * (Método exploración cuadratica). Para asegurar la eficiencia del método
 * es necesario que el tamaño de la tabla contenga un número primo.
 * 
 * @author Lux Ferre
 *
 */
public class NameLookup {

	private int key;
	private String value;
	private static NameLookup[] table;
	private static int sizeTable;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);

			// se escoge un primo mayor cercano a n
			int prime = n + 1;
			while (!esPrimo(prime)) {
				prime++;
			}

			table = new NameLookup[prime];
			sizeTable = table.length;// el tamaño de la tabla es un número primo

			for (int i = 0; i < table.length; i++) {
				table[i] = null;
			}

			for (int i = 0; i < n; i++) {

				line = br.readLine();
				NameLookup hs = new NameLookup();

				StringTokenizer st = new StringTokenizer(line);

				hs.setKey(Integer.parseInt(st.nextToken()));
				hs.setValue(st.nextToken());

				add(hs);
			}

			int cases = Integer.parseInt(br.readLine());
			for (int i = 0; i < cases; i++) {

				int clave = Integer.parseInt(br.readLine());
				System.out.println(search(clave).getValue());
			}

		}

		br.close();
	}

	public static void add(NameLookup hash) {

		int pos = hashFunction(hash.getKey());
		table[pos] = hash;
		
		// ¡¡ Hay que tener en cuenta el factor de carga !!
	}

	public static NameLookup search(int key) {

		NameLookup ht;
		int pos = hashFunction(key);
		ht = table[pos];

		if (ht != null) {
			return ht;
		}
		return null;
	}

	public static int hashFunction(int key) {

		int i = 0;
		int p = key % sizeTable; // Aritmética modular

		while (table[p] != null && table[p].getKey() != key) {
			i++;
			p = p + i * i; // Método de colisión exploración cuadrática
			p = p % sizeTable;
		}
		return p;
	}

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

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
