package FileBackupScheduler;

import java.util.PriorityQueue;

public class FileBackupScheduler {

    private PriorityQueue<BackupTask> backupQueue;

    public FileBackupScheduler() {
        backupQueue = new PriorityQueue<>();
    }

    // Add backup task
    public void scheduleBackup(String path, int priority)
            throws InvalidBackupPathException {

        if (path == null || path.trim().isEmpty()) {
            throw new InvalidBackupPathException("Backup path is invalid!");
        }

        backupQueue.add(new BackupTask(path, priority));
        System.out.println("Backup scheduled for: " + path);
    }

    // Execute backups in priority order
    public void executeBackups() {
        System.out.println("\nExecuting Backup Tasks:");

        while (!backupQueue.isEmpty()) {
            BackupTask task = backupQueue.poll();
            System.out.println(
                    "Backing up folder: " + task.getFolderPath()
                    + " | Priority: " + task.getPriority()
            );
        }
    }
}
