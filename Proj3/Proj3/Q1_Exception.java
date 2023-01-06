import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Q1_Exception here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1_Exception
{
    public static void main(String [] args){
        int[] rand_array = new int[50];

        for (int i = 0; i < rand_array.length; i++){
            rand_array[i] = new Random().nextInt(50);

        }
        boolean loop = false;
        Scanner sc = new Scanner(System.in);
        while(!loop){

            try{
                System.out.println("Enter an index between (0-49): ");

                int index = sc.nextInt();
                System.out.println("The value at the index is :" + rand_array[index]);
                loop = true;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index is out of bounds, please re enter ");

            }catch(Exception e){
                System.out.print("Invalid index value, please enter again : ");
            }

        }        
         sc.close();
    }

}
