package com.springdemo.concept;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	private Point pointa;
	private Point pointb;
	private Point pointc;


	public Point getPointa() {
		return pointa;
	}


	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}


	public Point getPointb() {
		return pointb;
	}


	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}


	public Point getPointc() {
		return pointc;
	}


	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}


	public void sketch() {
		System.out.println("Point A =...."+getPointa().getX()+","+getPointa().getY());
		System.out.println("Point B =...."+getPointb().getX()+","+getPointb().getY());
		System.out.println("Point C =...."+getPointc().getX()+","+getPointc().getY());
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Bean end...");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean initialized...");
		
	}
	
	public void myInit()
	{
		System.out.println("my own initialization meyhod");
	}

	public void cleanUp()
	{
		System.out.println("clean bean...");
	}
}
