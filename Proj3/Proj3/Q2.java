import java.util.*;
import java.util.InputMismatchException;


public class Q2
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double sum;
        double product;
        double difference;
        double quotient;
        String operator;
        boolean loop = false;
        
        while(!loop){
            try{
                System.out.println("Enter a simple mathematical formula: ");
                num1 =  sc.nextDouble();
                operator = sc.next();
                num2 = sc.nextDouble();
                
                if(operator.equals("+")){
                    sum = num1 + num2;
                    System.out.println("The sum is: "+sum);
                    loop = true;
                }
                else if(operator.equals("-")){
                    difference = num1 - num2;
                    System.out.println("The difference is: "+difference);
                    loop = true;
                }
                else if(operator.equals("*")){
                    product = num1 * num2;
                    System.out.println("The product is: "+product);
                    loop = true;
                                    }
                else if(operator.equals("/")){
                    quotient = num1 / num2;
                    System.out.println("The quotient is: "+quotient);
                    loop = true;
                }
                else{
                       System.out.println("Invalid operator format");
                       sc.nextLine();
                }
                
            }catch(InputMismatchException ex){
                System.out.println("Invalid Number format");
                sc.nextLine();
            } catch(Exception e ){
                System.out.println("Invalid Input");
                sc.nextLine();
            }
            
        }
        sc.close();
    }
}
