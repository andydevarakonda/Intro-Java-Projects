

public class Hexagon extends Shape
{

    private double side_length;

    public Hexagon()
    {
        this(10,"White",true);
    }

    public Hexagon(double side_length){
        this(side_length,"White", true);
    }

    public Hexagon(double side_length,String color, boolean filled)
    {
        super(color, filled);
        setSideLength(side_length);
    }
    public void setSideLength(double side_length){
        
        this.side_length = side_length;
    }
    public double getSideLength(){

        return side_length;
    }

    public double getArea(){
        return (6*(getSideLength()*getSideLength())/(4*Math.tan(Math.PI/6)));

    }

    public double getPerimeter(){
        return 6 * getSideLength();
    }

    public String toString(){
        return super.toString() + ", Area =" + getArea() + ", Perimeter: "+getPerimeter();
    }
}
