package com.springdemo.concept;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.sketch();
	}

}
