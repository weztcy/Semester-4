public class Shape {
    String color = "red";
    boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape Color\t: " + color + "\nShape Filled\t: " + filled + "\n";
    }
}

class Circle extends Shape {
    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (3.14 * Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }

    @Override
    public String toString() {
        return super.toString() + "Shape Radius\t: " + radius + "\nShape Area\t: " + getArea() + "\nShape Perimeter\t: " + getPerimeter();
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (width * length);
    }

    public double getPerimeter() {
        return ((width + length) * 2);
    }

    @Override
    public String toString() {
        return super.toString() + "Shape Area\t: " + getArea() + "\nShape Perimeter\t: " + getPerimeter() + "\n";
    }
}

class Square extends Rectangle {
    Square() {}

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString() + "Shape Side\t: " + getSide() + "\n";
    }
}