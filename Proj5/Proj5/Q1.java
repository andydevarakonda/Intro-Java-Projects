
/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i +" f(i) = " + sigma(i));
        }
    }

    private static double sigma(double i) {
        if (i == 1) // This is the base case , when we 
            return 0.5; 
        else
            return  1 / (2*i) + sigma(i - 1); // Recursive call
    }
}


