package com.lmbm.learning.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestContestScoreboard {

	public static void main(String[] args) {

		List<Contest> list = new ArrayList<>();

		list.add(new Contest(1, 2, 10, "I"));
		list.add(new Contest(3, 1, 11, "C"));
		list.add(new Contest(1, 2, 21, "C"));
		list.add(new Contest(1, 1, 25, "C"));

		System.out.println("Unordered");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Collections.sort(list, new Comparator<Contest>() {
			@Override
			public int compare(Contest o1, Contest o2) {
				return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
			}
		});
		System.out.println();
		System.out.println("Ordered");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		int time = 0;
		List<Contest> result = new ArrayList<>();
		int cont = 0;
		int p = 1;
		for (Contest contest : list) {

			if (contest.getVerdict().equals("C")) {
				cont++;
				time = time + contest.getTime();

			} else if (contest.getVerdict().equals("I")) {
				time += 20;
			}

			if (p < list.size()) {
				if (contest.getId() != list.get(p).getId()) {
					result.add(new Contest(contest.getId(), cont, time, "C"));
					cont = 0;
					time = 0;
				}
			}

			if (p == list.size()) {
				result.add(new Contest(contest.getId(), cont, time, "C"));
			}
			p++;
		}
		
		Collections.sort(result);
		System.out.println();
		System.out.println("Contest Scoreboard");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

	public static class Contest implements Comparable<Contest> {

		public int id;
		public int problem;
		public int time;
		public String verdict;

		public Contest(int id, int problem, int time, String verdict) {
			this.id = id;
			this.problem = problem;
			this.time = time;
			this.verdict = verdict;
		}

		@Override
		public String toString() {
			return id + " " + problem + " " + time;
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getProblem() {
			return problem;
		}

		public void setProblem(int problem) {
			this.problem = problem;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public String getVerdict() {
			return verdict;
		}

		public void setVerdict(String verdict) {
			this.verdict = verdict;
		}

	}
}
