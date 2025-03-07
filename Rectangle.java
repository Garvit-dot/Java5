package Assignment_5;

public class Rectangle extends Shape 
{
    //constructor
    public Rectangle(double length, double width){
        super(length, width, 0);
    }

    public double getPerimeter(){
        return 2 + (dim_one * dim_two);
    }

    public double getArea(){
        return dim_one * dim_two;
    }
}
