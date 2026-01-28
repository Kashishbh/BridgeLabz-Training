package FileBackupScheduler;

public class Main {

    public static void main(String[] args) {

        FileBackupScheduler scheduler = new FileBackupScheduler();

        try {
            scheduler.scheduleBackup("C:/SystemFiles", 10);   // Critical
            scheduler.scheduleBackup("D:/Projects", 5);
            scheduler.scheduleBackup("E:/Movies", 2);
            scheduler.scheduleBackup("", 8); // Exception
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}
