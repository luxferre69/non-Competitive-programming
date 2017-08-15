package competitive.programming.super_easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * UVa 11727
 * 
 * @author Lux Ferre
 *
 */
public class CostCutting_UVa11727 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.parseInt(reader.readLine());

		for (int i = 0; i < cases; i++) {

			String[] vec = reader.readLine().split(" ");

			int x = Integer.parseInt(vec[0]);
			int y = Integer.parseInt(vec[1]);
			int z = Integer.parseInt(vec[2]);

			int[] mat = { x, y, z };

			Arrays.sort(mat);

			System.out.println("Case " + (i + 1) + ": " + mat[1]);
		}

		reader.close();
	}

}
