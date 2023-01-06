import java.util.Scanner;

public class Q2
{
    public static void main (String[] args) throws CloneNotSupportedException
    {
        double side_length = 0.0;
        boolean filled;
        String color;
        
        Scanner sc = new Scanner(System.in);
        //Get all the inputs
        System.out.println("Input Hexagon Side Length:");
        side_length = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Is it Filled?(True/False):");
        filled = sc.nextBoolean();
        sc.nextLine();
        
        System.out.println("Input Color:");
        color = sc.nextLine();
        
        
        
        //Cloning and printing toStrings
        Hexagon hex = new Hexagon(side_length, color, filled);
        System.out.println("Hexagon 1 \n"+hex.toString());
        Hexagon hex2 = (Hexagon) hex.clone();
        System.out.println("Hexagon 2 \n"+hex2.toString());
        
        if(hex.compareTo(hex2) == 1){
            System.out.println("Are hexagon 1 and Hexagon 2 the same?:No, hexegon 1 is bigger than hexagon 2");
        
        }
        if(hex.compareTo(hex2) == -1){
            System.out.println("Are hexagon 1 and Hexagon 2 the same?:No, hexegon 2 is bigger than hexagon 1");
        
        }
        if(hex.compareTo(hex2) == 0){
            System.out.println("Are hexagon 1 and Hexagon 2 the same?:Yes");
        
        }
        
        
    }
    
}
