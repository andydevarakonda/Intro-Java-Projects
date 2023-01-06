
/**
 * Write a description of class Rctangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{

    private double width;
    private double length;

    public Rectangle()
    {
        this(10,10,"White",true);
    }

    public Rectangle(double length,double width){
        this(length,width,"White", true);
    }

    public Rectangle(double length,double width,String color, boolean filled)
    {
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length)
    {

        this.length = length;
    }

    public void setWidth(double width)
    {

        this.width = width;
    }

    public double getLength(){

        return length;
    }

    public double getWidth(){

        return width;
    }

    public double getArea(){
        return getLength()*getWidth();

    }

    public double getPerimeter(){
        return 2* (getLength()+getWidth());
    }

    public String toString(){
        return super.toString() + ", Area =" + getArea() + ", Perimeter: "+getPerimeter();
    }

}
