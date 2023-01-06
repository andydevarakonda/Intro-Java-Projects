import java.util.Arrays;
/**
 * Write a description of class testShapes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    
        public static void main (String[] args) throws CloneNotSupportedException
    {
        Shape[] shapes1 = new Shape[5]; 
        
        shapes1[0] = new Rectangle(5,9,"Blue",false);
        shapes1[1] = new Rectangle(4,11,"Black",true);
        shapes1[2] = new Rectangle(1,8,"Red",false);
        shapes1[3] = new Hexagon(7,"Yellow",true);
        shapes1[4] = new Hexagon(3,"Green",false);
        
        double[] Area = new double[5]; 
        double Total_Area = 0.0;
        System.out.println("Shapes1 array:\n");
        for(int i = 0;i <5;i++){
            Area[i] = shapes1[i].getArea();
            System.out.println("Area for shape" + (i+1)+" is: "+ Area[i]); 
        }
        for(int i = 0;i <5;i++){
            Total_Area = Total_Area + shapes1[i].getArea();
            
        }
        System.out.println("Total Area for all shapes in shapes1 array is:"+Total_Area);
        
        Shape[] shapes2 = (Shape[]) shapes1.clone(); 
        Arrays.sort(shapes2);
        System.out.println("\nShapes2 array(sorted):\n");
        System.out.println("Areas in shape2 array" +" is:\n" );
         for(int i = 0;i <5;i++){
            Area[i] = shapes2[i].getArea();
            System.out.println(Area[i]); 
        }
    }

}