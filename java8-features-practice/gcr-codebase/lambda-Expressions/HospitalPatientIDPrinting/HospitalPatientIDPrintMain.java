package HospitalPatientIDPrinting;
import java.util.ArrayList;
import java.util.List;
public class HospitalPatientIDPrintMain{
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(183, "Antonia"));
        patients.add(new Patient(92, "Kamee"));
        patients.add(new Patient(534, "Susane"));
        System.out.println("Patient IDs:");
        // Using method reference to print IDs
        patients.stream()
                .map(Patient::getId)   // method reference instead of lambda
                .forEach(System.out::println); // method reference instead of lambda
    }
}
