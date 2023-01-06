import java.io.*;

class Q1 {
    public static void main(String[] args) {

        Q1 q = new Q1();

        q.execute();

    }

    public int readCount() {

        int count = 0;
        try {

            DataInputStream input= new DataInputStream(new FileInputStream("count.dat"));
            String str = input.readUTF();
            count = Integer.parseInt(str);
            input.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public void execute() 
    { 
        int count = readCount();            
        System.out.println( count + " times");
        count++;
        writeCount(count); 

    }

    public void writeCount(int count) {
        try {
            DataOutputStream output= new DataOutputStream(new FileOutputStream("count.dat"));
            output.writeUTF(Integer.toString(count));
            output.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}