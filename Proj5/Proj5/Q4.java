import java.io.File;

public class Q4
{
    public static void main(String[] args)
    {
        String path = "C:\\Users\\andy\\Desktop\\COSC 121\\53472585_A5\\Folder 1";
        File main_directory = new File(path);
        if(main_directory.isDirectory() && main_directory.exists() )
        {
            File array[] = main_directory.listFiles();
            listAllFiles(array,0,0); 
        } 
    }

    public static void listAllFiles(File[] array,int a, int b) 
    { 
        if(a == array.length)
            return;
        for (int x = 0; x < b; x++)
            System.out.print("\t");
        if(array[a].isFile())
            System.out.println(array[a].getName());

        else if(array[a].isDirectory())
        {
            System.out.println("[" + array[a].getName() + "]");
            listAllFiles(array[a].listFiles(), 0, b + 1);
        } 
        listAllFiles(array,++a, b);
    }

}