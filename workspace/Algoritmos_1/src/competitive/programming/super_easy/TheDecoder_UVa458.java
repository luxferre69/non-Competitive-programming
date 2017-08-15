package competitive.programming.super_easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * La salida da bn, se compara los valores y son los mismos, por una extraña 
 * razón da WA, un espacio o algo interviene en dar una respuesta correcta
 * se hace la sol en c++
 * 
 * @author Lux Ferre
 *
 */
public class TheDecoder_UVa458 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea;
		while ((linea = br.readLine()) != null) {
			if (!linea.isEmpty()) {
				for (int i = 0; i < linea.length(); i++) {
					char p = (char) ((linea.charAt(i)) - 7);
					System.out.print(p);
				}
				System.out.println();
			} else {
				break;
			}
		}
		br.close();
	}

}
