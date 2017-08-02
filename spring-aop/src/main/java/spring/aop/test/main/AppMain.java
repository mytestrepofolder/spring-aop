package spring.aop.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.test.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("spring-config.xml"); 
		ShapeService sc = ctx.getBean("shapeService", ShapeService.class);
		//sc.getCircle().setName("Plabon's Circle");
		//sc.getCircle().setNAmeAndReturn("Plabon's Circle");
		sc.getCircle();
	}

}
