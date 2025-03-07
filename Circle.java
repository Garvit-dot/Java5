package Assignment_5;

public class Circle extends Shape
{
     //constructor
    public Circle(double radius){
        super(radius, 0, 0);
    }

    public double getArea(){
        return 2 * Math.PI * dim_one * dim_one;
    }

    public double getPerimeter(){
        return 2 * Math.PI * dim_one;
    }
}
