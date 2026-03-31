package HospitalSystem;
public class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double consultationFee() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient | ID: " + getPatientId() +", Name: " + getName() +", Fee: ₹" + consultationFee);
    }
}
