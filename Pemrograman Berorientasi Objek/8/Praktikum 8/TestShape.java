import java.util.Scanner;
import java.io.*;

public class TestShape {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        String colorShape;
        boolean fillShape;
        while (menu != 4) {
            System.out.println("Welcome to our shape program:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Insert menu: ");
            menu = input.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.print("Pick color: ");
                    colorShape = input.next();
                    System.out.print("Fill the shape? (true/false): ");
                    fillShape = input.nextBoolean();
                    System.out.print("Input radius: ");
                    double radius = input.nextDouble();
                    Shape circle = new Circle(radius, colorShape, fillShape);
                    System.out.println(circle.toString());
                    break;
                case 2:
                    System.out.print("Pick color: ");
                    colorShape = input.next();
                    System.out.print("Fill the shape? (true/false): ");
                    fillShape = input.nextBoolean();
                    System.out.print("Input length: ");
                    double length = input.nextDouble();
                    System.out.print("Input width: ");
                    double width = input.nextDouble();
                    Shape rectangle = new Rectangle(length, width, colorShape, fillShape);
                    System.out.println(rectangle.toString());
                    break;
                case 3:
                    System.out.print("Pick color: ");
                    colorShape = input.next();
                    System.out.print("Fill the shape? (true/false): ");
                    fillShape = input.nextBoolean();
                    System.out.print("Input side length: ");
                    double side = input.nextDouble();
                    Shape square = new Square(side, colorShape, fillShape);
                    System.out.println(square.toString());
                    break;
                case 4:
                    System.out.println("Thanks for using our programs, see you again!");
                    break;
            }
        }
    }
}