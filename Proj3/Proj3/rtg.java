import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class rtg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rtg
{
    
        public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
         try {
            System.out.println("Enter Integer Value: ");
            Integer inputInt = scanner.nextInt(); // input : "1.1"  
            System.out.println(inputInt);

         } 
         catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer "+ ex);
         }
   
}
    }

