import java.util.*;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        setAge(age);
    }
    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println("---------------------------");
    }
    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }
    protected void addMedicalRecord(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); 
    }
}
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private static final double DAILY_CHARGE = 2000.0;
    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.numberOfDays = days;
    }
    @Override
    public double calculateBill() {
        return numberOfDays * DAILY_CHARGE;
    }
    @Override
    public void addRecord(String record) {
        addMedicalRecord(record);
    }
    @Override
    public void viewRecords() {
        System.out.println("In-Patient Medical Records:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 500.0;
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }
    @Override
    public void addRecord(String record) {
        addMedicalRecord(record);
    }
    @Override
    public void viewRecords() {
        System.out.println("Out-Patient Medical Records:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Patient inPatient = new InPatient(101, "Ami", 30, 5);
        Patient outPatient = new OutPatient(102, "Kam", 21);
        patients.add(inPatient);
        patients.add(outPatient);
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) inPatient;
            record.addRecord("Appendix Surgery");
            record.addRecord("Post-surgery medication");
        }

        if (outPatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) outPatient;
            record.addRecord("General Checkup");
        }
        for (Patient patient : patients) {
            patient.getPatientDetails();
        }
    }
}
