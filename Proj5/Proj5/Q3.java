import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input_char;
        int count_char;
        System.out.print("Enter Text : ");
        String text = sc.nextLine();

        System.out.print("Enter Single Character: ");
        input_char = sc.nextLine().charAt(0);
        count_char = countChar(text, input_char);

        System.out.println(count_char +"No. of times "+ input_char +" appears in the text");
    }
    public static int countChar(String input, char c) {
        if (input.length() == 0) {
            return 0;
        }
        int num = 0;
        if (input.charAt(0) == c) {
            num++;
        }
        return num + countChar(input.substring(1), c);
    }

    


}