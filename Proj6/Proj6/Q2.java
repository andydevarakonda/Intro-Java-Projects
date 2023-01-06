import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Q2
{
    public static void main(String [] args) throws FileNotFoundException 
    {
        Scanner sc  = new Scanner(System.in);

        printShuffled("story.txt");

    }

    public static void printShuffled(String filename) throws FileNotFoundException
    {
        File f = new File(filename);
        Scanner sc  = new Scanner(f);
        String next;
        ArrayList<String> sentence = new ArrayList<String>();
        sc.useDelimiter("[.:!?]");
        while(sc.hasNext()){
            next = sc.next();
            sentence.add(next);
        }

        Collections.shuffle(sentence);

        Iterator iter = sentence.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

    }
}
