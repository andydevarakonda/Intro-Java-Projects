import java.util.*;

/**
 * Q3 Answer: The type of error that is thrown when an invalid input such as 4.5a
 * is called an java.lang.NumberFormatException.This error happens when the input
 * is alphanumeric.alphanumeric input. Non-numeric letters
 * other than + and -  is not permitted for parsing the input string into a double.

 */
public class Q3
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String string_num1;
        String string_num2;

        double sum;
        double product;
        double difference;
        double quotient;
        String operator;
        boolean loop = false;

        while(!loop){
            try{
                System.out.println("Enter a simple mathematical formula: ");
                string_num1 =  sc.next();
                

                operator = sc.next();

                string_num2 = sc.next();
                

                if(operator.equals("+")){
                    sum = Double.parseDouble(string_num1) + Double.parseDouble(string_num2);
                    System.out.println("The sum is: "+sum);
                    loop = true;
                }
                else if(operator.equals("-")){
                    difference = Double.parseDouble(string_num1) - Double.parseDouble(string_num2);
                    System.out.println("The difference is: "+difference);
                    loop = true;
                }
                else if(operator.equals("*")){
                    product = Double.parseDouble(string_num1) * Double.parseDouble(string_num2);
                    System.out.println("The product is: "+product);
                    loop = true;
                }
                else if(operator.equals("/")){
                    quotient = Double.parseDouble(string_num1) / Double.parseDouble(string_num2);
                    System.out.println("The quotient is: "+ quotient);
                    loop = true;
                }
                else{
                    System.out.println("Invalid operator format");
                    sc.nextLine();
                }

            }catch(NumberFormatException e ){
                System.out.println("Invalid, Number Format Exception( Enter number with no letters)");
                sc.nextLine();
            }

        }

    }
}
