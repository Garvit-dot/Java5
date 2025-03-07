package Assignment_5;

public abstract class Shape implements Shape_interface
{
    protected double dim_one, dim_two, dim_three;

    //default constructor initializing to zero
    public Shape(){
        dim_one = dim_two = dim_three = 0;
    }

    //parameterized constructor
    public Shape(double dim_one, double dim_two, double dim_three){
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }

    //abstract methods force subclasses to implement their own formulas
    @Override
    public abstract double getPerimeter();

    @Override
    public abstract double getArea();

    //default implementation for volume (for 2D shapes)
    @Override
    public double getVolume(){
        return 0; //2D shapes have no volume
    }
}
