package competitive.programming.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * UVa 10258 Contest Scoreboard
 * 
 * It's OK  but show PRESENTATION ERROR
 *  7 Submissions PE !!
 * 
 * That who perseveres, succeeds !!
 * 
 * @author Lux Ferre
 *
 */
public class ContestScoreboard_UVa10258 {

	public static List<Contest> list;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			if (i == 0) {
				line = br.readLine(); // linea en blanco
			}

			list = new ArrayList<>();

			while ((line = br.readLine()) != null && !line.isEmpty()) {

				String[] arr = line.split(" ");

				if (arr[3].equals("C") || arr[3].equals("I")) {
					list.add(new Contest(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
							arr[3]));
				} else {
					list.add(new Contest(Integer.parseInt(arr[0]), 0, 0, arr[3]));
				}
			}

			Collections.sort(list, new Comparator<Contest>() {
				@Override
				public int compare(Contest o1, Contest o2) {

					// Ordena primero por id
					int c = new Integer(o1.getId()).compareTo(new Integer(o2.getId()));

					// Ordena segundo por problema
					if (c == 0) {
						c = new Integer(o1.getProblem()).compareTo(new Integer(o2.getProblem()));
					}
					return c;
				}
			});

			List<Contest> result = new ArrayList<>();
			int cont = 0;
			int p = 1;
			boolean solved = false;
			int time = 0;
			int sum = 0;
			for (Contest contest : list) {

				if (contest.getVerdict().equals("C") && !solved) {
					cont++;
					time += contest.getTime();
					solved = true;
				}

				if (p < list.size()) {

					if (contest.getProblem() != list.get(p).getProblem() && contest.getId() == list.get(p).getId()) {
						sum = 0;
						solved = false;
					}

					if (contest.getId() != list.get(p).getId()) {

						if (cont != 0 && sum >= 20) {
							time += sum;
						}

						result.add(new Contest(contest.getId(), cont, time, "C"));
						cont = 0;
						time = 0;
						sum = 0;
						solved = false;

					} else {

						// Se cuentan los envios incorrectos antes de la
						// solución correcta
						if (contest.getProblem() == list.get(p).getProblem() && contest.getVerdict().equals("I")
								&& !solved) {
							sum += 20;

							if (list.get(p).getVerdict().equals("C")) {
								time += sum;
								sum = 0;
							}
						}
					}
				}

				if (p == list.size()) {
					result.add(new Contest(contest.getId(), cont, time, "C"));
				}
				p++;
			}

			Collections.sort(result);
			for (int j = 0; j < result.size(); j++) {
				System.out.print(result.get(j));
				System.out.println();
			}

			if (i < cases - 2) {
				System.out.println();
			}

			if (i == cases - 1) {
				System.out.println();
			}

		}

		br.close();
	}

	/**
	 * Class contest -- implement interface Comparable
	 * 
	 * @author Lux Ferre
	 *
	 */
	static class Contest implements Comparable<Contest> {

		public int id;
		public int problem;
		public int time;
		public String verdict;

		public Contest(int numContest, int problem, int time, String veredict) {

			this.id = numContest;
			this.problem = problem;
			this.time = time;
			this.verdict = veredict;
		}

		@Override
		public int compareTo(Contest o) {

			if (problem != o.problem) // can use this primary field to decide
				// sorted order
				return o.problem - problem; // ICPC rule: sort by number of
			// problem solved
			else if (time != o.time) // solved == o.solved, but we can use
				// secondary field to decide sorted
				// order
				return time - o.time; // ICPC rule: sort by descending penalty
			else // solved == o.solved AND penalty == o.penalty
				return id - o.id;
		}

		@Override
		public String toString() {
			return id + " " + problem + " " + time;
		}

		public int getId() {
			return id;
		}

		public int getProblem() {
			return problem;
		}

		public int getTime() {
			return time;
		}

		public String getVerdict() {
			return verdict;
		}

	}

}
