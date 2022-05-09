package com.springdemo.concept;

public class Triangle {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void sketch() {
		System.out.println(getType()+" Sketch triangle....");
	}

}
