package competitive.programming.stringprocessing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * 
 * @author Competitive programming book
 *
 */
public class KindergartenCountinGame_UVa494 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			
			// utilizando expresion regular, tomado del libro competitive programming
			// tomando unicamente letras upper/lower
			System.out.println(line.replaceAll("[^a-zA-Z]+", " ").trim().split(" ").length);
		}
		br.close();
	}

}
