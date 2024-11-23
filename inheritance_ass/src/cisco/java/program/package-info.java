
class Shape {
    
    public double area() {
        return 0; 
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

   
    public double area() {
        return 0.5 * base * height;
    }
}

// Square class extends Shape
class Square extends Shape {
    private double side;

    // Constructor to initialize side length
    public Square(double side) {
        this.side = side;
    }

    // Override the area() method to calculate the area of a square
    @Override
    public double area() {
        return side * side;
    }
}

// Rhombus class extends Shape
class Rhombus extends Shape {
    private double diag1;
    private double diag2;

    // Constructor to initialize diagonals
    public Rhombus(double diag1, double diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    // Override the area() method to calculate the area of a rhombus
    @Override
    public double area() {
        return 0.5 * diag1 * diag2;
    }
}

public class shape {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[4];

        // Instantiate different shapes and assign to the array
        shapes[0] = new Rectangle(4, 5);  // Rectangle with length 4 and width 5
        shapes[1] = new Triangle(6, 7);   // Triangle with base 6 and height 7
        shapes[2] = new Square(4);        // Square with side 4
        shapes[3] = new Rhombus(5, 6);    // Rhombus with diagonals 5 and 6

        // Loop through the array of shapes and dynamically call the appropriate area() method
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());  // Dynamic polymorphism
        }
    }
}
