package competitive.programming.adhoc.games;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Lux Ferre
 *
 */
public class HangmanJudge_UVa489 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.equals("-1")) {

			int round = Integer.parseInt(line);
			String puzzle = br.readLine();
			String userGuess = br.readLine();

			StringBuilder nueva = new StringBuilder();
			StringBuilder repeat = new StringBuilder();
			int hang = 0;
			boolean lose = false;

			for (int i = 0; i < userGuess.length(); i++) {

				String letter = String.valueOf(userGuess.charAt(i));

				boolean rep = false;
				for (int k = 0; k < nueva.length(); k++) {
					String r = String.valueOf(nueva.charAt(k));

					if (letter.equals(r)) {
						rep = true;
					}
				}

				boolean aux = false;
				for (int k = 0; k < repeat.length(); k++) {
					String r = String.valueOf(repeat.charAt(k));

					if (letter.equals(r)) {
						aux = true;
					}
				}

				boolean found = false;
				boolean found2 = false;
				int m = 0;

				if (!rep && !aux) {
					for (int j = 0; j < puzzle.length(); j++) {

						String each = String.valueOf(puzzle.charAt(j));

						if (letter.equals(each) && hang < 7) {
							nueva.append(each);
							found = true;
						} else if (m == 0) {
							repeat.append(letter);
							found2 = true;
							m = 1;
						}

					}
					if (!found || !found2) {
						hang++;

						if (hang == 7) {
							lose = true;
							break;
						}

					}
				}
			}

			System.out.println("Round " + round);
			if (nueva.length() == puzzle.length()) {
				System.out.println("You win.");
			} else if (lose) {
				System.out.println("You lose.");
			} else {
				System.out.println("You chickened out.");
			}
		}

		br.close();
	}
}
