public abstract class Shape implements Comparable<Shape>, Cloneable {
    //attributes
    private String color;
    private boolean filled;
    private double Area;
    //constructors
    protected Shape() {
        this("White", true);
    }

    protected Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }
    //methods
    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setFilled(boolean f) {
        filled=f;
    }

    public String toString() {
        return "Color: "+color+". "+ (filled? "Filled? Yes.":"Filled? No. ");

    }
    
    @Override
    public int compareTo(Shape shape){
        
        if(this.getArea() > shape.getArea())
        {
            return 1;
        }
        if(this.getArea()< shape.getArea())
        {
            return -1;
        }
        return 0;
    }
     
    public Object clone() throws CloneNotSupportedException {
    return super.clone();
    }
    

    
    //abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();
    
}