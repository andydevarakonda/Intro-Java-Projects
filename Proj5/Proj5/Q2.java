import java. io.*;
import java.util.Scanner;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter Word: ");
        input = sc.nextLine();
        System.out.println("Reverse of input word: "+reverse(input));
        
    }

    private static String reverse(String input){
        // base case
        if((input == null) || (input.length() <= 1)){
            return input;
        }
        // recursive call
        return reverse(input.substring(1))+input.substring(0,1);  
    }   
}

