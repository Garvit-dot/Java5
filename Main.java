package Assignment_5;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        while(true) 
        {
            System.out.println("\nChoose a shape to calculate:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Sphere");
            System.out.println("5. Equilateral Pyramid");
            System.out.println("6. Cylinder");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice) 
            {
                case 1:
                    System.out.print("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    displayResults(square, false);
                    break;
                
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    displayResults(rectangle, false);
                    break;
                
                case 3:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    displayResults(circle, false);
                    break;
                
                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    radius = scanner.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    displayResults(sphere, true);
                    break;
                
                case 5:
                    System.out.print("Enter base length of the equilateral pyramid: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double height = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(base, height);
                    displayResults(pyramid, true);
                    break;
                
                case 6:
                    System.out.print("Enter radius of the cylinder: ");
                    radius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    displayResults(cylinder, true);
                    break;
                
                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    public static void displayResults(Shape shape, boolean is3D)
    {
        System.out.println("\nResults:");
        if (!is3D) {
            System.out.println("Perimeter: " + shape.getPerimeter() + " units");
            System.out.println("Area: " + shape.getArea() + " unit²");
        } else {
            System.out.println("Area: " + shape.getArea() + " unit²");
            System.out.println("Volume: " + shape.getVolume() + " unit³");
        }
    }
}
