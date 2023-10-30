package demo;

abstract class AbstractShapes {
	Shape() {
		System.out.println("Let's start drawing!");
	}

	abstract void draw();

	void completeDraw() {
		System.out.println("Circle is drawn!");
	}
}

class Circle extends AbstractShapes {

	void draw() {
		System.out.println("The abstract hidden method draws circle!");

	}
}
