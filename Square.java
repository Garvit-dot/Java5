package Assignment_5;

public class Square extends Shape 
{
    //constructor
    public Square(double side){
        super(side, side, 0);
    }

    @Override
    public double getPerimeter(){
        return 4 * dim_one;
    }

    @Override
    public double getArea(){
        return dim_one * dim_one;
    }
}
