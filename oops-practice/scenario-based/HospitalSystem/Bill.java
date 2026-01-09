package HospitalSystem;
public class Bill implements IPayable {

    private Patient patient;
    private double amount;

    public Bill(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    @Override
    public double calAmount() {
        return amount;
    }

    public void generateBill() {
        System.out.println("\n--- Bill Details ---");
        patient.displayInfo();
        System.out.println("Total Amount: ₹" + calAmount());
    }
}

