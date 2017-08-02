package spring.aop.test.model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle Setter Called");
	}
	
	public String setNAmeAndReturn(String name) {
		this.name = name;
		System.out.println("Circle setNameAndReturn Called");
		return name;
	}
	
	
}
