import java.util.*;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1_defensive
{
    public static void main(String [] args){
        int[] rand_array = new int[50];
        
        for (int i = 0; i < rand_array.length; i++){
           rand_array[i] = new Random().nextInt(50);
                    
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index with in (0-49): ");
        
        int index = sc.nextInt();
        while( index < 0 || index >= 50){
            
            System.out.print("Invalid index value, please enter again : ");
            index = sc.nextInt();
        }
        
        System.out.println("The value at the index is :" + rand_array[index]);
        
    }
    

}

