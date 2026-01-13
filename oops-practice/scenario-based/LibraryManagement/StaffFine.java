package LibraryManagement;
public class StaffFine implements FineCalculator {
    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 1.0;
    }
}
