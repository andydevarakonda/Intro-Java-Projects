import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numArray.add(sc.nextInt());
        }
        numArray = noDuplicates(numArray);

        System.out.print("List without the duplicates:  ");

        for (int i = 0; i < numArray.size(); i++){
            System.out.print(numArray.get(i) + " ");
        }
    }

    public static ArrayList<Integer> noDuplicates (ArrayList<Integer> list) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if (temp.contains(list.get(i)) == false){
                temp.add(list.get(i));
            }
        }
        return temp;
    }
}