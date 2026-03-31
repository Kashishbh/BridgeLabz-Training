// Efficient File Copy
import java.io.*;
public class BufferedStreams{
    private static final int BUFFER_SIZE = 4096; 
    public static void main(String[] args) {

        File source = new File("input.txt");   
        File unbufferedDest = new File("copy_unbuffered.dat");
        File bufferedDest = new File("copy_buffered.dat");

        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // -------- Unbuffered Streams --------
        long startUnbuffered = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(unbufferedDest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endUnbuffered = System.nanoTime();

        // -------- Buffered Streams --------
        long startBuffered = System.nanoTime();

        try (BufferedInputStream bis =new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedDest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endBuffered = System.nanoTime();
        long unbufferedTime = endUnbuffered - startUnbuffered;
        long bufferedTime = endBuffered - startBuffered;

        System.out.println("Unbuffered Stream Time (ns): " + unbufferedTime);
        System.out.println("Buffered Stream Time   (ns): " + bufferedTime);

        if (bufferedTime < unbufferedTime) {
            System.out.println("Buffered streams are faster.");
        } else {
            System.out.println("Unbuffered streams are faster (unexpected).");
        }
    }
}
