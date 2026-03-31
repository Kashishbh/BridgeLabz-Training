package HospitalSystem;
import java.util.*;

public class HospitalPatientManagementSystem {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Krish", 21, 4, 1900);
        Patient p2 = new OutPatient(102, "Kiara", 33, 1200);

        patients.add(p1);
        patients.add(p2);

        Doctor doctor = new Doctor(1, "Dr. Verma", "Orthopedic");
        doctor.displayDocInfo();

        System.out.println("\nPatient List");
        for (Patient patient : patients) {
            patient.displayInfo(); 
        }

        Bill bill1 = new Bill(p1, ((InPatient) p1).totalCharge());
        Bill bill2 = new Bill(p2, ((OutPatient) p2).consultationFee());

        bill1.generateBill();
        bill2.generateBill();
    }
}

