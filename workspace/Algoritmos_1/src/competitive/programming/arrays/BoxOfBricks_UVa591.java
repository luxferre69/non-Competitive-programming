package competitive.programming.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * 
 * @author Lux Ferre
 *
 */
public class BoxOfBricks_UVa591 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int set = 1;

		while ((line = br.readLine()) != null && !line.equals("0")) {

			int n = Integer.parseInt(line);
			String[] stack = br.readLine().split(" ");

			int average = 0;

			for (int i = 0; i < stack.length; i++) {
				average += Integer.parseInt(stack[i]);
			}

			average = average / n;

			int diff = 0;
			for (int i = 0; i < stack.length; i++) {

				diff += Math.abs(average - Integer.parseInt(stack[i]));
			}
			System.out.println("Set #" + (set++));
			System.out.println("The minimum number of moves is " + (diff / 2) + ".");
			System.out.println();
		}
		br.close();
	}
}
