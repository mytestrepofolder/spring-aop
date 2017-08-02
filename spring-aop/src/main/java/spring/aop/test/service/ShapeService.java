package spring.aop.test.service;

import spring.aop.test.aspect.Loggable;
import spring.aop.test.model.Circle;
import spring.aop.test.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}	
}
