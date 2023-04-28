public class Main {
    public static void main(String[] args) {

//        Shape shapeArrow;

//        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

// Arrow pointing to a circle object
        shapeArrow = circle;
        shapeArrow.draw(); // Drawing a circle.

// Arrow pointing to a triangle object
        shapeArrow = triangle;
        shapeArrow.draw(); // Drawing a triangle.

// Arrow pointing to a rectangle object
        shapeArrow = rectangle;
        shapeArrow.draw(); // Drawing a rectangle.

// Arrow pointing to a right triangle object (subclass of Triangle)
        RightTriangle rightTriangle = new RightTriangle();
        shapeArrow = rightTriangle;
        shapeArrow.draw(); // Drawing a right triangle.

// Arrow pointing to an isosceles triangle object (subclass of Triangle)
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        shapeArrow = isoscelesTriangle;
        shapeArrow.draw(); // Drawing an isosceles triangle.

// Arrow pointing to a square object (subclass of Rectangle)
//        Square square = new Square();
//        shapeArrow = square;
//        shapeArrow.draw(); // Drawing a square.

        Shape shapeArrow;
        Circle circle = new Circle();

// Arrow pointing to a circle object
        shapeArrow = circle;

// Calling draw() on the reference to execute the draw() method of the object it is pointing to
        shapeArrow.draw(); // Output: Drawing a circle.
    }
}


