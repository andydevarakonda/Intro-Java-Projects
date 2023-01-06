import java.util.*;
import java.io.IOException;
import java.util.InputMismatchException;

public class PatientManager
{
    static PriorityQueue<Patient> waitingList = new PriorityQueue<Patient>(new PatientComparator());
    private static int count = 0;
    public static void start(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        menu();
        while(true){
            try{
                choice = sc.nextInt();
            }catch(InputMismatchException i){
                choice = -1;
            }
            finally{
                sc.nextLine();
            }

            if(choice == 1){
                addPatient();
            }
            else if(choice == 2){
                showPatient();
            }
            else if(choice == 3){
                displayPatient();
            }
            else if(choice == 4){
                System.out.println("Done!");
                System.exit(0);
            }
            else{
                System.out.println("Wrong Choice");
            }

            System.out.println("Choose an item from the menu: ");

        }
    }

    private static void addPatient()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient's name:");
        String name = sc.nextLine();
        count++;
        int emergencyLevel = 0;
        boolean val = false;
        while(!val) {
            System.out.println("Enter emergency [1(low risk) to 5(life or death, high risk)]: ");
            emergencyLevel =sc.nextInt();
            try {
                
                if(emergencyLevel<1 || emergencyLevel>5 )
                    throw new InputMismatchException();
                val=true;
            }
            catch(InputMismatchException e) {
                
                System.out.println("Wrong value.Try again.");
                sc.next();
            }            
        }
        waitingList.offer(new Patient(count,name,emergencyLevel));
        System.out.println("Patient added to waitlist.");
    }

    private static void showPatient()
    {
        if(!waitingList.isEmpty()){
            System.out.println(":" + waitingList.poll()+" has been treated");
        }
        else{
            System.out.println("No more patients");
        }
    }

    private static void displayPatient()
    {
        if(!waitingList.isEmpty()){
            PriorityQueue<Patient> list = new PriorityQueue<Patient>(new PatientComparator());
            for( Patient p: waitingList){
                list.offer(p);
            }
            System.out.println("Waiting List Patient are :");
            while(!list.isEmpty()){
                System.out.println(list.poll());
            }
        }
        else{
            System.out.println("No more patients on the waiting list");
        }
    }

    private static void menu(){
        System.out.println("--------------------");
        System.out.println("(1) New Patient. ");
        System.out.println("(2) Next Patient.");
        System.out.println("(3) Waiting List.");
        System.out.println("(4) Exit.");
        System.out.println("--------------------");
        System.out.println("Please select an option");
    }
}
