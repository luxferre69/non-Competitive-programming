package competitive.programming.super_easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackPhysics_UVa10071 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);

			int res = (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())) * 2;
			System.out.println(res);
		}
		br.close();
	}

}
