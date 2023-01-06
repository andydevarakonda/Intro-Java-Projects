import java.io.*;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BackupRestore
{
    private static int piece = 0;
    public static int backup(String filename, double partSize)throws IOException{
        
        FileInputStream file_in = new FileInputStream(new File(filename));
        while(file_in.available() > 0)
        {
            String destination = filename + "."+ piece;
            FileOutputStream file_out = new FileOutputStream(new File(destination));
            int currentSize = 0;
            while(currentSize < partSize){
                try{
                    file_out.write(file_in.read());
                    currentSize++;
                }catch(EOFException ex){
                    return -1;
                }
            }
            file_out.close();
            piece++;
        }
        return piece;
    }

    public static long restore(String filename, int numberOfPieces){

        long fileSize = 0;
        for(int i = 1 ; i<=numberOfPieces ; i++){
            fileSize = fileSize +  (new File(filename + "."+ i)).length();
        }
        return fileSize;
    }

    public static void main(String [] args) throws IOException {
        backup("Syllabus.pdf",1000*35); // split it by 35 KB
        System.out.format("Size of the file: %d bytes", restore("Syllabus.pdf",piece));
    }
}
