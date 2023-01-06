import java.io.*;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    private static void viewHex(String filename) throws IOException {
        DataInputStream input= new DataInputStream(new FileInputStream(filename));
        String str = input.readUTF();

        StringBuffer buff = new StringBuffer();
      
        char character[] = str.toCharArray();
        String hexString = "";
        for(int i = 1; i < character.length; i++) {
            if( i % 7 == 0){
                hexString = hexString + Integer.toHexString(character[i]) + "|" + " "+ "\n" ;
            }
            else{
                hexString = Integer.toHexString(character[i])+" ";
            }
            buff.append(hexString);
        }
        String text = buff.toString();
        System.out.println(text);

    }

    public static void main(String [] args) throws IOException {
        viewHex("beemovie.txt");

    }
}
