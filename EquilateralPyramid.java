package Assignment_5;

public class EquilateralPyramid extends Shape
{
    private double base;
    private double height;

    //constructor
    public EquilateralPyramid(double base, double height){
        super(base, height, 0);
        this.base = base;
        this.height = height;
    }


    @Override
    public double getArea()
    {
        double slantHeight = Math.sqrt((base / 2) * (base / 2) + height * height);
        double lateralArea = 2 * base * slantHeight;
        double baseArea = base * base;

        return lateralArea + baseArea;  //Surface Area
    }

    @Override
    public double getPerimeter(){
        return 0;   //3D shapes do not have a perimeter
    }

    @Override
    public double getVolume(){
        return (1.0 / 3) * base * base * height;
    }
}
