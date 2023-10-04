package com.mindcraft.pack1;

public class Student {
	private int rollNum;
	private String name;
	
	public Student() {
		rollNum = 1001;
		name = "Ashish";
	}
	public Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}
	public void show() {
		System.out.println(rollNum + " " + name);
	}
}

