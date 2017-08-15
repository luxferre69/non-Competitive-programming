package competitive.programming.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheSnail_UVa578 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while ((line = br.readLine()) != null) {

			if (line.equals("0 0 0 0"))
				break;

			String[] arr = line.split(" ");

			int h = Integer.parseInt(arr[0]);
			int u = Integer.parseInt(arr[1]);
			int d = Integer.parseInt(arr[2]);
			int f = Integer.parseInt(arr[3]);

			double distClimb = u;
			double afterClimb = distClimb;
			double afterSlide = afterClimb - d; // cuenta el primer dia 
			int day = 1;

			double percent = (double) u * f / 100;
			
			// Empieza a contar desde el segundo dia
			while (afterClimb < h && afterClimb > 0) {

				day++;
				
				distClimb = Math.abs(distClimb - percent);
				afterClimb = distClimb + afterSlide;
				
				if (afterClimb > h) {
					break;
				}
				
				if (afterClimb < h) {
					afterSlide = afterClimb - d;
				}

//				 System.out.println("Diaaa " + day);
//				 System.out.println(" Distance Climbed : " + distClimb);
//				 System.out.println(" Height After Climbing : " + afterClimb);
//				 System.out.println(" Height After Sliding : " + afterSlide);
				
				if (distClimb < 0) { 
					distClimb = 0;
				}
			}

			if (afterClimb > h) {
				System.out.println("success on day " + day);
			} else {
				System.out.println("failure on day " + day);
			}

		}

		br.close();

	}

}
