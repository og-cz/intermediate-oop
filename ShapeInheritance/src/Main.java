// interface
interface Shape {double calculateArea();}

//Circle class implementing Shape interface
	class Circle implements Shape { private double radius; 
		public Circle(double radius) {this.radius = radius;}
		@Override
		public double calculateArea() {return Math.PI *radius* radius;}
}

//Rectangle class implementing Shape interface
	class Rectangle implements Shape {
		private double length, width;
		public Rectangle(double length, double width) { this.length = length; this.width = width; }
		@Override
		public double calculateArea() { return length * width; }
	}
	
	public class Main {
		public static void main(String[] args) {
//interface inheritance
			Circle circle = new Circle(5);	System.out.println("Area of circle:"  + circle.calculateArea());
			Rectangle rectangle = new Rectangle(4,6);
			System.out.println("Area of rectangle:" + rectangle.calculateArea());
		}
	}