package com.springdemo.concept;

public class Triangle {
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}



	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}



	public Triangle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 */
	public void sketch() {
		System.out.println(getType()+" Sketch triangle....Height = "+ getHeight());
	}

}
