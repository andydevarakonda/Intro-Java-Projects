import java.util.Scanner;
/**
 * Write a description of class testRect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main (String[] args) throws CloneNotSupportedException
    {
        double length = 0.0;
        double width = 0.0;
        boolean filled;
        String color;
        
        Scanner sc = new Scanner(System.in);
        //Get all the inputs
        System.out.println("Input Rectangle Length:");
        length = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Input Rectangle Width:");
        width = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Is it Filled?(True/False):");
        filled = sc.nextBoolean();
        sc.nextLine();
        
        System.out.println("Input Color:");
        color = sc.nextLine();
        
        
        
        //Cloning and printing toStrings
         Rectangle rect = new Rectangle(length,width, color, filled);
        System.out.println("Rectangle 1 \n"+rect.toString());
        Rectangle rect2 = (Rectangle) rect.clone();
        System.out.println("Rectangle 2 \n"+rect2.toString());
        
        if(rect.compareTo(rect2) == 1){
            System.out.println("Are Rectangle 1 and Rectangle 2 the same?:No, rectangle 1 is bigger than rectangle 2");
        
        }
        if(rect.compareTo(rect2) == -1){
            System.out.println("Are Rectangle 1 and Rectangle 2 the same?:No, rectangle 2 is bigger than rectangle 1");
        
        }
        if(rect.compareTo(rect2) == 0){
            System.out.println("Are Rectangle 1 and Rectangle 2 the same?:Yes");
        
        }
        
        
    }
}
