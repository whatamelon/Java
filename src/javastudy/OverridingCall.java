package javastudy;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	
}

public class OverridingCall {
	public static void main(String[] args) {
		Shape line = new Line();
		Shape rect = new Rect();
		Shape circle = new Circle();
		
		line.draw();
		rect.draw();
		circle.draw();
		
	}
}