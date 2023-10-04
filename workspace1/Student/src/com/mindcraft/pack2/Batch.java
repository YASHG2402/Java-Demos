package com.mindcraft.pack2;

public class Batch {
	private String courseName;
	private int batchStrength;
	
	public Batch() {
		courseName = "Science";
		batchStrength = 70;
	}
	public Batch(String courseName, int batchStrength) {
		this.courseName = courseName;
		this.batchStrength = batchStrength;
	}
	public void show() {
		System.out.println(courseName + " " + batchStrength);
	}
}
