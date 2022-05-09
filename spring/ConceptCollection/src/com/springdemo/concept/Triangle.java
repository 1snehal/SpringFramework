package com.springdemo.concept;

import java.util.List;

public class Triangle {
	private List<Point> point;
	public List<Point> getPoint() {
		return point;
	}

	public void setPoint(List<Point> point) {
		this.point = point;
	}



	public void sketch() {
		for(Point points: point)
		{
		System.out.println("Point A =...."+points.getX()+","+points.getY());
		}
	}

}
