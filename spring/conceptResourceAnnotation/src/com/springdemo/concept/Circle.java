package com.springdemo.concept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@PostConstruct
public void initialized()
{
System.out.println("initialized");	
}
public void destory() {
	System.out.println("clean");	
}
}
