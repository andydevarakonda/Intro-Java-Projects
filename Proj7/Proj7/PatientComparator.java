import java.util.*;

public class PatientComparator implements Comparator<Patient> {

    public int compare(Patient patient1, Patient patient2) {
        if(patient1.getEmergency()>patient2.getEmergency())
            return -1 ;
        else if(patient1.getEmergency()<patient2.getEmergency())
            return 1;
        else
            return patient1.getOrder()-patient2.getOrder();
    }
}