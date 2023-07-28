package interfaceAbstractProject;


//Shape Interface
interface Shape {
 void draw();
 double getArea();
}

//AbstractShape class implementing the Shape interface
abstract class AbstractShape implements Shape {
 protected String name;

 // Constructor for AbstractShape
 public AbstractShape(String name) {
     this.name = name;
 }

 // Common method to print shape name
 public void printName() {
     System.out.println("Shape: " + name);
 }
}

//Circle class
class Circle extends AbstractShape {
 private double radius;

 // Constructor for Circle
 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a circle...");
 }

 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//Square class
class Square extends AbstractShape {
 private double side;

 // Constructor for Square
 public Square(String name, double side) {
     super(name);
     this.side = side;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a square...");
 }

 @Override
 public double getArea() {
     return side * side;
 }
}

public class ShapeImplementation {
 public static void main(String[] args) {
     // Create Circle and Square objects
     Circle circle = new Circle("Circle", 5.0);
     Square square = new Square("Square", 4.0);

     // Call methods and print details
     circle.draw();
     circle.printName();
     System.out.println("Area: " + circle.getArea());

     square.draw();
     square.printName();
     System.out.println("Area: " + square.getArea());
 }
}
