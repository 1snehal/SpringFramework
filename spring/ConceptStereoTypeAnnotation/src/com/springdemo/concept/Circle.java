package com.springdemo.concept;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
private Point center;

public Point getCenter() {
	return center;
}

public void setCenter(Point center) {
	this.center = center;
}

@Override
public void draw() {
	System.out.println("Circle...");
	System.out.println("points are: "+center.getX()+","+center.getY());
	
}

}
