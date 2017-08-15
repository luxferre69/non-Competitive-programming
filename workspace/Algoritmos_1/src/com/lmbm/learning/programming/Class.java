package com.lmbm.learning.programming;

class pop {

	private int id, solved;

	public pop(int id, int solved) {
		this.id = id;
		this.solved = solved;
	}

	public String toString() {
		return "id: " + id + ", solved: " + solved;
	}

}

public class Class{

	public static void main(String[] args) {
		
		pop p = new pop(1, 2);
		
		System.out.println(p);

	}

}
