package Assignment_5;

public class Sphere extends Shape
{
    //constructor
    public Sphere(double radius){
        super(radius, 0, 0);
    }

    @Override
    public double getVolume(){
        return 4 * Math.PI * (Math.pow(dim_one, 3));
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(dim_one, 2);  //Surface Area
    }

    @Override
    public double getPerimeter(){
        return 0;   //3D shapes do not have a perimeter
    }
}
