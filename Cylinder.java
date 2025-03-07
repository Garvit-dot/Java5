package Assignment_5;

public class Cylinder extends Shape 
{
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height){
        super(radius, height, 0);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * radius * (radius + height);    //Surface Area
    }

    @Override
    public double getPerimeter(){
        return 0;   //3D shapes do not have a perimeter
    }

    @Override
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
}
