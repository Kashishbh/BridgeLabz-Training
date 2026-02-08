package DataSerializationforBackup;

public class Main {
	public static void main(String[] args) {
        Employee emp = new Employee(101, "Kami");
        TempData temp = new TempData("ABC123");
        BackupProcessor.backup(emp);   
        BackupProcessor.backup(temp);  
    }
}
