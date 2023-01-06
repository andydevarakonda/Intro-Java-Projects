import java.io.*;
import java.util.*;
public class CopyFileCapitalized 
{
    public static void main(String[] args) throws Exception 
    { 
        Scanner sc = new Scanner(System.in);
        String censoredWords[] = {"ABC", "XYZ"};
        String data = "";
        try {
            File file = new File("source.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                data = data + in.nextLine() + "\n";

            }
            data = data.toUpperCase();
            //replaceCensoredWords(data, censoredWords);
            System.out.println( );
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
           
        }
        try {
            FileWriter writer = new FileWriter("destination.txt");
            writer.write(replaceCensoredWords(data, censoredWords)+"\n Censored source.txt file");
            writer.close();
            System.out.println("Successfully uploaded");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            
        }
    }

    private static String replaceCensoredWords(String line, String[] censoredWords)
    {
        String word;
        String text = "";
        Scanner sc = new Scanner(line);         
        while (sc.hasNext()) {
            word = sc.next();
            if (word.equals(censoredWords[0]) || word.equals(censoredWords[1])) {
                text = text + "..."+" ";
            } else {
                text =text+word+ " ";
            }

        }
        return text;
    }
}