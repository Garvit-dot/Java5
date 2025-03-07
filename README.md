# Shape Calculator

## Overview
This Java program allows users to calculate the area, perimeter (for 2D shapes), and volume (for 3D shapes) of various geometric shapes. The program features an interactive menu where users can input shape dimensions and obtain results accordingly.

## Features
- Supports multiple shapes:
  - **2D Shapes**: Square, Rectangle, Circle
  - **3D Shapes**: Sphere, Equilateral Pyramid, Cylinder
- Uses **OOP principles** including abstraction and interfaces.
- Implements **inheritance** to streamline shape properties.
- **Interface-driven design** to enforce method consistency across different shapes.

## Technologies Used
- **Java** (JDK 8 or later)
- **Scanner Class** for user input

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/ShapeCalculator.git
   ```
2. Navigate to the project directory:
   ```sh
   cd ShapeCalculator
   ```
3. Compile the program:
   ```sh
   javac Assignment_5/*.java
   ```
4. Run the program:
   ```sh
   java Assignment_5.Main
   ```

## Program Structure
```
Assignment_5/
│── Main.java                 # Handles user interaction & menu system
│── Shape_interface.java      # Interface defining methods for area, perimeter, volume
│── Shape.java                # Abstract class implementing common shape behavior
│── Square.java               # Implementation for square
│── Rectangle.java            # Implementation for rectangle
│── Circle.java               # Implementation for circle
│── Sphere.java               # Implementation for sphere
│── EquilateralPyramid.java   # Implementation for equilateral pyramid
│── Cylinder.java             # Implementation for cylinder
```

## Example Usage
```
Choose a shape to calculate:
1. Square
2. Rectangle
3. Circle
4. Sphere
5. Equilateral Pyramid
6. Cylinder
0. Exit
Enter your choice: 1
Enter side of the square: 5

Results:
Perimeter: 20 units
Area: 25 unit²
```

## Known Issues
- The `Rectangle.getPerimeter()` method contains an error (`2 + (length * width)`). It should be `2 * (length + width)`.
- 3D shapes do not have a perimeter, but the interface enforces its implementation.

## License
This project is licensed under the MIT License.
