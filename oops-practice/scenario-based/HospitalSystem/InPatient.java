package HospitalSystem;
public class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double totalCharge() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient | ID: " + getPatientId() +", Name: " + getName() +", Days: " + daysAdmitted);
    }
}
